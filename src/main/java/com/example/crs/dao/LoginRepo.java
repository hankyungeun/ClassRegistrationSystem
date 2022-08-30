package com.example.crs.dao;

import com.example.crs.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepo extends JpaRepository<Member, String>, JpaSpecificationExecutor<Member> {
    Optional<Member> findById(String id);
}
