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
    private String id;

    @Column(name = "class_name")
    private String className;

    @Column(name = "class_number")
    private short classNum;

    @Column
    private String division;

    @Column
    private short distribution;

    @Column
    private short credit;

    @Column
    private String professor;


    @Column(name = "max_Student_Num")
    private int maxStudent;

    @Column(name = "cur_Student_Num")
    private int curStudent;

    @Column(name = "lecture_room")
    private String lectureRoom;

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
