package com.example.crs.service;

import com.example.crs.dao.ClassRepo;
import com.example.crs.model.Class;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor    //final만 사용가능
@Service
public class ClassService {
    private final ClassRepo classRepo;

    @Transactional
    public List<Class> findClass() {
        return classRepo.findAll();
    }

    @Transactional
    public boolean updateCurStudent(String classId, int n) {
        Class classEntity = classRepo.findById(classId)
                .orElseThrow(() -> new IllegalArgumentException("해당 강의가 없습니다. id=" + classId));
        if (0 <= classEntity.getCurStudent() && classEntity.getCurStudent() + n >= classEntity.getMaxStudent()) {
            classEntity.setCurStudent(classEntity.getCurStudent() + n);
            return true;
        } else {
            return false;
        }
    }
}
