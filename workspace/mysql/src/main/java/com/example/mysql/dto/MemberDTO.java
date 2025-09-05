package com.example.mysql.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of="id")
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MemberDTO {
    //    @EqualsAndHashCode.Include
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String createdDate;
    private String updatedDate;
}
