package com.example.crs.dto;

import com.example.crs.model.Class;
import com.example.crs.model.Member;
import com.example.crs.model.RegisterEntityPK;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Register {
    private RegisterEntityPK registerEntityPK;
    private Member memberEntity;
    private Class classEntity;

    @Builder
    public Register(RegisterEntityPK registerEntityPK, Member memberEntity, Class classEntity) {
        this.registerEntityPK = registerEntityPK;
        this.memberEntity = memberEntity;
        this.classEntity = classEntity;
    }
}