package com.example.crs.dao;

import com.example.crs.model.RegisterEntity;
import com.example.crs.model.RegisterEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterEntity, RegisterEntityPK>{
}
