package com.example.crs.dao;

import com.example.crs.model.CartEntity;
import com.example.crs.model.CartEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepo extends JpaRepository<CartEntity, CartEntityPK> {
    @Query(value = "SELECT * FROM (SELECT * FROM crsdb.cart WHERE member_id = :memberId) as mycart WHERE mycart.class_id NOT IN (SELECT class_id FROM crsdb.register WHERE member_id = :memberId)", nativeQuery = true)
    List<CartEntity> findByMemberId(String memberId);
}
