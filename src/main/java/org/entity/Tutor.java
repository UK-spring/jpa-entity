package org.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor {

    // PK
    @Id
    private Long id;

    // 필드
    @Column(unique = true, length = 20, nullable = false)
    private String name;
//    private Integer age;

    // 기본 생성자
    public Tutor() {
    }

    // 쉽게 사용하기 위해 생성자 추가
    public Tutor(Long id, String name) {
        this.id = id;
        this.name = name;
    }

//    public Tutor(Long id, String name, Integer age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
}
