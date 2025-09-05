package com.example.mysql.mapper;

import com.example.mysql.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    //    회원 가입
    public void join(MemberVO memberVO);

    //    로그인
    public MemberVO login(MemberVO memberVO);


    //    이메일로 회원 정보 조회
    public MemberVO findInformationByEmail(String memberEmail);
//    이메일로 중복 검사
//    이메일로 조회시 결과가 한개면 중복있음
//    이메일로 조회시 결과가 0개면 중복있음
    public int findEmailSameCount(String memberEmail);

    public List<MemberVO> findAllMembers();

    public void deleteId(MemberVO memberVO);

}
