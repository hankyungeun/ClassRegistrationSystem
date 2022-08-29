package com.example.crs.service;

import com.example.crs.dto.Cart;
import com.example.crs.model.CartEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartMapper {
    public Cart fromCartEntity(CartEntity CartEntity) {
        return new Cart(CartEntity.getCartEntityPK(), CartEntity.getMemberEntity(), CartEntity.getClassEntity());
    }

    public CartEntity fromCart(Cart Cart) {
        return new CartEntity(Cart.getCartEntityPK(), Cart.getMemberEntity(), Cart.getClassEntity());
    }

    public List<Cart> fromCartEntityList(List<CartEntity> CartEntityList) {
        List<Cart> CartList = new ArrayList<>();
        for (CartEntity CartEntity : CartEntityList) {
            CartList.add(fromCartEntity(CartEntity));
        }
        return CartList;
    }
}
