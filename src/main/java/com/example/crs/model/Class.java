package com.example.crs.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "class")
@Data
public class Class {
    @Id
    @Column(nullable = false)
    //기본키
    private String id;

    @Column(name = "class_name")
    //교과목명
    private String className;

    @Column(name = "class_number")
    //학수번호
    private String classNum;

    @Column
    //이수구분(전공 등)
    private String division;

    @Column
    //분반
    private short distribution;

    @Column
    //학점
    private short credit;

    @Column
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

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                ", classNum=" + classNum +
                ", division='" + division + '\'' +
                ", distribution=" + distribution +
                ", credit=" + credit +
                ", professor='" + professor + '\'' +
                ", maxStudent=" + maxStudent +
                ", curStudent=" + curStudent +
                ", lectureRoom='" + lectureRoom + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
