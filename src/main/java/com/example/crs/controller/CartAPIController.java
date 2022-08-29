package com.example.crs.controller;

import com.example.crs.dto.Cart;
import com.example.crs.model.Member;
import com.example.crs.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartAPIController {
    private final CartService cartService;

    @GetMapping
    public List<Cart> getCarts(@SessionAttribute(name = "loginMember") Member member) {
        return cartService.getCarts(member);
    }
}