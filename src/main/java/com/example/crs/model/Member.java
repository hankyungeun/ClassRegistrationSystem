package com.example.crs.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@ToString(exclude = "registerEntitySet")
@NoArgsConstructor
public class Member {
    @Id
    @Column(nullable = false)
    //학번
    private String id;

    @Column(nullable = false)
    //이름
    private String name;

    @Column(nullable = false)
    //비밀번호
    private String passwd;

    @Column(nullable = false)
    //학년
    private short grade;

    @Column(nullable = false)
    //학과
    private String department;

    @Column(name = "max_credits")
    //최대신청학점
    private int maxCredits;

    @Column(name = "min_credits")
    //최소신청학점
    private int minCredits;

    @Column(name = "now_credits")
    @ColumnDefault("0")
    // 현재신청학점
    private int nowCredits;

    @OneToMany(mappedBy = "classEntity")
    Set<RegisterEntity> registerEntitySet;

    public Member(String id) {
        this.id = id;
    }
}
