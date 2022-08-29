package com.example.crs.service;

import com.example.crs.dao.RegisterRepo;
import com.example.crs.dto.Register;
import com.example.crs.model.Member;
import com.example.crs.model.RegisterEntity;
import com.example.crs.model.RegisterEntityPK;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegisterService {
    private final RegisterMapper registerMapper;
    private final RegisterRepo registerRepo;

    @Transactional
    public Register addRegister(Register register) {
        RegisterEntity registerEntity = registerMapper.fromRegister(register);
        return registerMapper.fromRegisterEntity(registerRepo.save(registerEntity));
    }

    @Transactional
    public void delRegister(RegisterEntityPK registerEntityPK) {
        registerRepo.deleteById(registerEntityPK);
    }

    @Transactional(readOnly = true)
    public List<Register> getRegisters(Member member) {
        return registerMapper.fromRegisterEntityList((List<RegisterEntity>) registerRepo.findByMemberId(member.getId())
                .orElseThrow(() -> new IllegalArgumentException("회원 정보가 없습니다. id=" + member.getId())));
    }
}
