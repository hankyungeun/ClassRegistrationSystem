package com.example.crs.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "register")
@Table(name = "register")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class RegisterEntity implements Serializable {
    @EmbeddedId
    private RegisterEntityPK registerEntityPK;

    @ManyToOne
    @MapsId("member_id")
    @JoinColumn(name = "member_id")
    private Member memberEntity;

    @ManyToOne
    @MapsId("class_id")
    @JoinColumn(name = "class_id")
    private Class classEntity;

    public RegisterEntity(RegisterEntityPK registerEntityPK, Member memberEntity, Class classEntity) {
        this.registerEntityPK = registerEntityPK;
        this.memberEntity = memberEntity;
        this.classEntity = classEntity;
    }
}