//package com.example.crs.service;
//
//import com.example.crs.model.Register;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RegisterMapper {
//    public Register fromClassEntity(ClassEntity classEntity) {
//        ClassDTO classDTO = new ClassDTO(classEntity.getClassName(), classEntity.getClassNum(), classEntity.getDivision(), classEntity.getDistribution(), classEntity.getCredit(), classEntity.getProfessor(), classEntity.getMaxStudent(), classEntity.getCurStudent(), classEntity.getLectureRoom(), classEntity.getTime());
//        classDTO.setId(classDTO.getId());
//        return classDTO;
//    }
//
//    public ClassEntity fromClass(ClassDTO _class) {
//        ClassEntity classEntity = new ClassEntity(_class.getClassName(), _class.getClassNum(), _class.getDivision(), _class.getDistribution(), _class.getCredit(), _class.getProfessor(), _class.getMaxStudent(), _class.getCurStudent(), _class.getLectureRoom(), _class.getTime());
//        classEntity.setId(_class.getId());
//        return classEntity;
//    }
//
//    public List<ClassDTO> fromClassEntityList(List<ClassEntity> classEntityList) {
//        List<ClassDTO> list = new ArrayList<>();
//        for (ClassEntity memberEntity : classEntityList) {
//            list.add(fromClassEntity(memberEntity));
//        }
//        return list;
//    }
//}
