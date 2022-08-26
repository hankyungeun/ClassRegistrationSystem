package com.example.crs.dto;

import com.example.crs.model.Class;
import com.example.crs.model.Member;
import com.example.crs.model.RegisterEntityPK;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Register {
    private RegisterEntityPK registerEntityPK;
    private Member memberEntity;
    private Class classEntity;

    public Register(RegisterEntityPK registerEntityPK, Member memberEntity, Class classEntity) {
        this.registerEntityPK = registerEntityPK;
        this.memberEntity = memberEntity;
        this.classEntity = classEntity;
    }
}
