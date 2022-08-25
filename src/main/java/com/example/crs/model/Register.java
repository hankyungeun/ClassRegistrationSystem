package com.example.crs.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "register")
@Table(name = "register")
@Data
public class Register implements Serializable {
    @EmbeddedId
    private RegisterPK registerPK;

    @ManyToOne
    @MapsId("member_id")
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @MapsId("class_id")
    @JoinColumn(name = "class_id")
    private Class _class;
}
