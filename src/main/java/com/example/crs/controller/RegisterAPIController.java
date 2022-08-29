package com.example.crs.controller;

import com.example.crs.dto.Register;
import com.example.crs.model.Member;
import com.example.crs.model.RegisterEntityPK;
import com.example.crs.service.ClassService;
import com.example.crs.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterAPIController {
    private final RegisterService registerService;
    private final ClassService classService;

    @GetMapping
    public List<Register> getRegisters(@SessionAttribute(name = "loginMember") Member member) {
        return registerService.getRegisters(member);
    }

    @PostMapping
    public void add(@RequestBody Register register) {
        registerService.addRegister(register);
        classService.updateCurStudent(register.getClassEntity().getId(), -1);
    }

    @DeleteMapping
    public void del(@RequestBody String memberId, @RequestBody String classId, Model model) {
        registerService.delRegister(new RegisterEntityPK(memberId, classId));
        if (!classService.updateCurStudent(classId, 1)) {
            model.addAttribute("error", 1);
        }
    }
}
