package com.example.crs.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Embeddable
@NoArgsConstructor
public class RegisterPK implements Serializable {
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "class_id")
    private String classId;
}