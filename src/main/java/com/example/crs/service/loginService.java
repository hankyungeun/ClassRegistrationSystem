//package com.example.crs.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.lang.reflect.Member;
//
//@Service
//@RequiredArgsConstructor
//public class loginService {
//
//    private loginRepo loginRepo;
//
//    public Member login(String name, String passwd) {
//        return loginRepo.findByName(name)
//                .filter(m -> m.getPasswd().equals(passwd))
//                .orElse(null);
//    }
//
//}
