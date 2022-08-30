package com.example.crs.controller;

import com.example.crs.SessionConstants;
import com.example.crs.dto.Register;
import com.example.crs.model.Member;
import com.example.crs.model.Class;
import com.example.crs.model.RegisterEntityPK;
import com.example.crs.service.ClassService;
import com.example.crs.service.MemberService;
import com.example.crs.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterAPIController {
    private final RegisterService registerService;
    private final ClassService classService;
    private final MemberService memberService;

    @GetMapping
    public List<Register> getRegisters(@SessionAttribute(name = "loginMember") Member member) {
        return registerService.getRegisters(member);
    }

    @PostMapping
    public void add(@RequestBody Class classEntity, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Member memberEntity = (Member) session.getAttribute(SessionConstants.LOGIN_MEMBER);

        Register register = new Register(new RegisterEntityPK(memberEntity.getId(), classEntity.getId()), memberEntity, classEntity);
        registerService.addRegister(register);
        classService.updateCurStudent(register.getClassEntity().getId(), -1);
        memberService.updateNowCredits(register.getMemberEntity().getId(), register.getClassEntity().getCredit());

        session.setAttribute(SessionConstants.LOGIN_MEMBER, memberService.getMember(memberEntity.getId()));
    }

    @DeleteMapping
    public void del(@RequestBody Class classEntity, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Member memberEntity = (Member) session.getAttribute(SessionConstants.LOGIN_MEMBER);

        Register register = new Register(new RegisterEntityPK(memberEntity.getId(), classEntity.getId()), memberEntity, classEntity);
        registerService.delRegister(new RegisterEntityPK(register.getMemberEntity().getId(), register.getClassEntity().getId()));
        if (!classService.updateCurStudent(register.getClassEntity().getId(), 1)) {
            model.addAttribute("error1", 1);
        }
        if (!memberService.updateNowCredits(register.getMemberEntity().getId(), -register.getClassEntity().getCredit())) {
            model.addAttribute("error2", 1);
        }

        session.setAttribute(SessionConstants.LOGIN_MEMBER, memberService.getMember(((Member) session.getAttribute(SessionConstants.LOGIN_MEMBER)).getId()));
    }
}
