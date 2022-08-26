package com.example.crs.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "class")
@Data
@ToString(exclude = "registerEntitySet")
public class Class {
    @Id
    //학수번호
    private String id;

    @Column(name = "class_name")
    //교과목명
    private String className;

    //이수구분(전공 등)
    private String division;

    //분반
    private short distribution;

    //학점
    private short credit;

    //담당교수
    private String professor;

    @Column(name = "max_Student_Num")
    //수강 최대 인원
    private int maxStudent;

    @Column(name = "cur_Student_Num")
    //현재 수강 인원
    private int curStudent;

    @Column(name = "lecture_room")
    //강의실
    private String lectureRoom;

    //강의시간
    private String time;

    @OneToMany(mappedBy = "memberEntity")
    Set<RegisterEntity> registerEntitySet;

//    @Override
//    public String toString() {
//        return "Class{" +
//                "className='" + className + '\'' +
//                ", classNum=" + number +
//                ", division='" + division + '\'' +
//                ", distribution=" + distribution +
//                ", credit=" + credit +
//                ", professor='" + professor + '\'' +
//                ", maxStudent=" + maxStudent +
//                ", curStudent=" + curStudent +
//                ", lectureRoom='" + lectureRoom + '\'' +
//                ", time='" + time + '\'' +
//                '}';
//    }
}
