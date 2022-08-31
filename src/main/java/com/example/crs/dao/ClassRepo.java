package com.example.crs.dao;

import com.example.crs.model.Class;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassRepo extends JpaRepository<Class, String>, JpaSpecificationExecutor<Class> {
    Optional<Class> findByClassName(String className);

}
