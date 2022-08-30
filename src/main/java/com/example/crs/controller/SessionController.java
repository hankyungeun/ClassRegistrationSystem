package com.example.crs.controller;

import com.example.crs.SessionConstants;
import com.example.crs.model.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



@Controller
public class SessionController {

//    @GetMapping("/")
//    public String home(@SessionAttribute(name = SessionConstants.LOGIN_MEMBER, required = false) Member loginMember, Model model) {
//        if(loginMember == null){
//            return "redirect:/login";
//        }
//        model.addAttribute("loginMember", loginMember);
//
////        System.out.println(loginMember);
//        return "redirect:/class";
//    }

    @GetMapping("/")
    public String home() {
        return "redirect:/class";
    }
}