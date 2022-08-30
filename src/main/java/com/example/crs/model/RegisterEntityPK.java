package com.example.crs.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@ToString
public class RegisterEntityPK implements Serializable {
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "class_id")
    private String classId;

    public RegisterEntityPK(String memberId, String classId) {
        this.memberId = memberId;
        this.classId = classId;
    }
}