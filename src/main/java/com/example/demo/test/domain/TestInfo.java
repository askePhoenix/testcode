package com.example.demo.test.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "test")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TestInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "contents")
    private String contents;

    @Column(name = "is_enable2",nullable = true)
    private Boolean isEnable;

    @Builder
    public TestInfo(Long id, String description, String contents, Boolean isEnable) {
        this.id = id;
        this.description = description;
        this.contents = contents;
        this.isEnable = isEnable;
    }
}
