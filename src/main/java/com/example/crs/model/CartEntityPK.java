package com.example.crs.model;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@ToString
public class CartEntityPK implements Serializable {
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "class_id")
    private String classId;

    public CartEntityPK(String memberId, String classId) {
        this.memberId = memberId;
        this.classId = classId;
    }
}
