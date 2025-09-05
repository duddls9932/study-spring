package com.example.mysql.domain;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString
@NoArgsConstructor
@EqualsAndHashCode(of="id")
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MemberVO {
    //    @EqualsAndHashCode.Include
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String createdDate;
    private String updatedDate;
}
