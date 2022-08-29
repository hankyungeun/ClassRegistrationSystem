package com.example.crs.dto;

import com.example.crs.model.CartEntityPK;
import com.example.crs.model.Class;
import com.example.crs.model.Member;
import com.example.crs.model.RegisterEntityPK;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cart {
    private CartEntityPK cartEntityPK;
    private Member memberEntity;
    private Class classEntity;

    @Builder
    public Cart(CartEntityPK cartEntityPK, Member memberEntity, Class classEntity) {
        this.cartEntityPK = cartEntityPK;
        this.memberEntity = memberEntity;
        this.classEntity = classEntity;
    }
}
