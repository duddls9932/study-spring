package com.example.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
@Getter@Setter@ToString
@Component
public class Student {
    String name;
    int koreanScore;
    int mathScore;
    int englishScore;
    int averageScore;
    //    학생 객체 생성(이름, 국어, 영어, 수학)
//    Convention에 맞게 제작한 뒤
//    ex06 제작
//    평균 출력
}
