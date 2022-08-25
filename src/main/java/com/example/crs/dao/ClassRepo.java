package com.example.crs.dao;

import com.example.crs.model.Class;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClassRepo extends JpaRepository<Class, String> {
}
