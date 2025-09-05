package com.example.mysql.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@EqualsAndHashCode(of="id")
public class PostMemberDTO {
    private Long id;
    private String postTitle;
    private String postContent;
    private String postReadCount;
    private String memberId;
    private String createdDate;
    private String updatedDate;
    private String memberName;
    private String memberPassword;
}
