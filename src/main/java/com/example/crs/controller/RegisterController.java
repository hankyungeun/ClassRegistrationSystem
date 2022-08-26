package com.example.crs.controller;

import com.example.crs.dto.Register;
import com.example.crs.model.Member;
import com.example.crs.model.RegisterEntityPK;
import com.example.crs.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {
    private final RegisterService registerService;
    @GetMapping
    public List<Register> getRegisters(@SessionAttribute(name = "loginMember") Member member) {
        return registerService.getRegisters(member);
    }

    @PostMapping
    public void add(@RequestBody Register register) {
        registerService.addRegister(register);
    }

    @DeleteMapping
    public void del(@RequestBody String memberId, @RequestBody String classId) {
        registerService.delRegister(new RegisterEntityPK(memberId, classId));
    }
}
