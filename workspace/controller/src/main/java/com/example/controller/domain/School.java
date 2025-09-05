package com.example.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter@Setter@ToString
@Component
public class School {
    private Long id;
    private String name;

    private List<Student> students;
}
