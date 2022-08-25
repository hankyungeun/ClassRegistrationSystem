package com.example.crs.dao;

import com.example.crs.model.Register;
import com.example.crs.model.RegisterPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<Register, RegisterPK>{
}
