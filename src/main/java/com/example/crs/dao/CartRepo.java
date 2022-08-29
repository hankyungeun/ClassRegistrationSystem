package com.example.crs.dao;

import com.example.crs.model.CartEntity;
import com.example.crs.model.CartEntityPK;
import com.example.crs.model.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CartRepo extends JpaRepository<CartEntity, CartEntityPK> {
    @Query(value = "select * from (select class_id from cart where member_id = :memberId) as myCart where myCart.class_id not in (select class_id from register where member_id = :memberId", nativeQuery = true)
    List<CartEntity> findByMemberId(String memberId);
}
