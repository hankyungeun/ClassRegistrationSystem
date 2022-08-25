package com.example.crs.service;

import com.example.crs.dao.ClassRepo;
import com.example.crs.model.Class;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClassService {
    private final ClassRepo classRepo;

    @Transactional
    public List<Class> findClass() {
        return classRepo.findAll();
    }
}
