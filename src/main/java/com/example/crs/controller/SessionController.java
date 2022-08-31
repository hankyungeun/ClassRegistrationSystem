package com.example.crs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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