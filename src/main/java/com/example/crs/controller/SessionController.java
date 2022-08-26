package com.example.crs.controller;

import com.example.crs.SessionConstants;
import com.example.crs.model.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



@Controller
@SessionAttributes("member")
public class SessionController {

    @GetMapping("/")
    public String home(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return "redirect:/login";

        }
        Member loginMember = (Member) session.getAttribute(SessionConstants.LOGIN_MEMBER);

        if (loginMember == null) {
            return "redirect:/login";
        }

        model.addAttribute("loginMember", loginMember);
        System.out.println(loginMember);
        return "redirect:/class";
    }
}
