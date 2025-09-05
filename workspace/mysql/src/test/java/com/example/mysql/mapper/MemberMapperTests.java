package com.example.mysql.mapper;

import com.example.mysql.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    private MemberMapper memberMapper;

//    @Test
//    public void testJoin(){
//        for (int i=1;i<11;i++){
//            MemberVO memberVO = new MemberVO();
//            memberVO.setMemberEmail("test@naver"+i+".com");
//            memberVO.setMemberPassword("1234");
//            memberVO.setMemberName("test");
//            memberMapper.join(memberVO);
//
//        }
//
//
//    }


//    @Test
//    public void testLogin(){
//        MemberVO memberVO = new MemberVO();
//        memberVO.setMemberEmail("test@gmail.com");
//        memberVO.setMemberPassword("1234");
//        memberVO.setMemberName("test");
//
//        assertThat(memberMapper.login(memberVO)).isNull();
//    }
    @Test
    public void testFindMember(){
        String memberEmail = "test@gmail.com";

        MemberVO member= memberMapper.findInformationByEmail(memberEmail);
        if(member != null){
            System.out.println(member);
        }
        else {
            System.out.println("존재하지않는 이메일입니다.");
        }
    }
    @Test
    public void testMemberEmailSame(){
        int count= 0;
        String memberEmail="test@gmail.com";
        count =memberMapper.findEmailSameCount(memberEmail);
        if (count > 0) {
            System.out.println("중복된 이메일입니다");
        }
        else {
            System.out.println("중복된이메일없음");
        }
    }
    @Test
    public void findAllMember(){
        String result = memberMapper.findAllMembers().toString();
        System.out.println(result);
    }
}
