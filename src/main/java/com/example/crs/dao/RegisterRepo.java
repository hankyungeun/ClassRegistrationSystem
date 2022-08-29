package com.example.crs.dao;

import com.example.crs.model.RegisterEntity;
import com.example.crs.model.RegisterEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterEntity, RegisterEntityPK>{
    @Query("select r from register r where member_id = :memberId")
    Optional<RegisterEntity> findByMemberId(String memberId);
}
