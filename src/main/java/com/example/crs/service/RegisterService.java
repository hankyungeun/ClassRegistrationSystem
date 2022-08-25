package com.example.crs.service;

import com.example.crs.dao.RegisterRepo;
import com.example.crs.model.Register;
import com.example.crs.model.RegisterPK;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RegisterService {
    private final RegisterRepo registerRepo;

    @Transactional
    public Register addRegister(Register register) {
        return registerRepo.save(register);
    }

    @Transactional
    public List<Register> getRegisters() {  // 수정 필요!!!(로그인한 아이디의 수강신청 목록이 보이도록)
        return registerRepo.findAll();
    }
}
