package com.example.crs.service;

import com.example.crs.dao.CartRepo;
import com.example.crs.dto.Cart;
import com.example.crs.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartMapper cartMapper;
    private final CartRepo cartRepo;

    @Transactional(readOnly = true)
    public List<Cart> getCarts(Member member) {
        return cartMapper.fromCartEntityList(cartRepo.findByMemberId(member.getId()));
    }
}
