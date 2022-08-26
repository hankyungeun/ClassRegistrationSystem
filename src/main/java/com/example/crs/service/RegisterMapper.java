package com.example.crs.service;

import com.example.crs.dto.Register;
import com.example.crs.model.RegisterEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RegisterMapper {
    public Register fromRegisterEntity(RegisterEntity registerEntity) {
        return new Register(registerEntity.getRegisterEntityPK(), registerEntity.getMemberEntity(), registerEntity.getClassEntity());
    }

    public RegisterEntity fromRegister(Register register) {
        return new RegisterEntity(register.getRegisterEntityPK(), register.getMemberEntity(), register.getClassEntity());
    }

    public List<Register> fromRegisterEntityList(List<RegisterEntity> registerEntityList) {
        List<Register> registerList = new ArrayList<>();
        for (RegisterEntity registerEntity : registerEntityList) {
            registerList.add(fromRegisterEntity(registerEntity));
        }
        return registerList;
    }
}
