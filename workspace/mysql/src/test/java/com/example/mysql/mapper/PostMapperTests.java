package com.example.mysql.mapper;

import com.example.mysql.domain.PostVO;
import com.example.mysql.dto.PostMemberDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostMapperTests {
    @Autowired
    private PostMapper postMapper;

    @Test
    public void addPostTest(){
        for (int i = 9; i < 14; i++) {
            PostVO postVO = new PostVO();
            postVO.setPostTitle("테스트입니다"+i);
            postVO.setPostContent("테스트 내용"+i);
            postVO.setMemberId(String.valueOf(i));
            postMapper.addPost(postVO);
        }


    }
    @Test
    public void selectById(){
        PostMemberDTO postMemberDTO = new PostMemberDTO();
        postMemberDTO=postMapper.selectById(5L);
        System.out.println(postMemberDTO);
    }
    @Test
    public void updatePost(){
       PostMemberDTO postMemberDTO = new PostMemberDTO();
       postMemberDTO.setMemberId("9");
       postMemberDTO.setPostTitle("찐수정w3");
       postMemberDTO.setPostContent("수정된내용");
       postMemberDTO.setMemberPassword("1234");
       postMapper.updatePost(postMemberDTO);
    }


    @Test
    public void deletePost(){
    postMapper.deletePostbyMemberId("1");
    }
    @Test
    public void findAllMember(){
        String result = postMapper.findAllPosts().toString();
        System.out.println(result);
    }

}
