package com.example.crs.service;

import com.example.crs.dao.ClassRepo;
import com.example.crs.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepo classRepo;

    @Transactional
    public List<Class> findClass() {
        return classRepo.findAll();
    }
}
