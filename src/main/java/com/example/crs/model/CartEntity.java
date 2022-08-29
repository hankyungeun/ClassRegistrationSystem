package com.example.crs.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "cart")
@Table(name = "cart")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class CartEntity implements Serializable {
    @EmbeddedId
    private CartEntityPK cartEntityPK;

    @ManyToOne
    @MapsId("member_id")
    @JoinColumn(name = "member_id")
    private Member memberEntity;

    @ManyToOne
    @MapsId("class_id")
    @JoinColumn(name = "class_id")
    private Class classEntity;

    public CartEntity(CartEntityPK cartEntityPK, Member memberEntity, Class classEntity) {
        this.cartEntityPK = cartEntityPK;
        this.memberEntity = memberEntity;
        this.classEntity = classEntity;
    }
}
