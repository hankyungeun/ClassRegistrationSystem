package com.example.crs.service;

import com.example.crs.dao.CartRepo;
import com.example.crs.dto.Cart;
import com.example.crs.model.CartEntity;
import com.example.crs.model.CartEntityPK;
import com.example.crs.model.Member;
import com.example.crs.model.RegisterEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartMapper cartMapper;
    private final CartRepo cartRepo;

    @Transactional
    public List<Cart> getCarts(Member member) {
        return cartMapper.fromCartEntityList((List<CartEntity>) cartRepo.findByMemberId(member.getId())
                .orElseThrow(() -> new IllegalArgumentException("회원 정보가 없습니다. id=" + member.getId())));
    }
}
