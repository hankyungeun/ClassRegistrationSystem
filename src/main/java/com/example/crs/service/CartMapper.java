package com.example.crs.service;

import com.example.crs.dto.Cart;
import com.example.crs.model.CartEntity;
import com.example.crs.model.CartEntityPK;
import com.example.crs.model.Class;
import com.example.crs.model.Member;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartMapper {
    public Cart fromCartEntity(CartEntity cartEntity) {
        return new Cart(cartEntity.getCartEntityPK(), cartEntity.getMemberEntity(), cartEntity.getClassEntity());
    }

    public CartEntity fromCart(Cart cart) {
        return new CartEntity(cart.getCartEntityPK(), cart.getMemberEntity(), cart.getClassEntity());
    }

    public List<Cart> fromCartEntityList(List<CartEntity> cartEntityList) {
        List<Cart> cartList = new ArrayList<>();
        for (CartEntity cartEntity : cartEntityList) {
            cartList.add(fromCartEntity(cartEntity));
        }
        return cartList;
    }
}
