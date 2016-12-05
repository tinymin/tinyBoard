package com.tinyboard.service;

import com.tinyboard.dto.PostCreateDTO;
import com.tinyboard.model.Post;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by SuncheolKim on 2016. 12. 5..
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PostServiceTest {
    @Autowired
    PostService postService;

    @Before
    public void setup() {
        Post post1 = postService.write(new PostCreateDTO("제목","내용","작성일","작성자","1234","태그1,태그2"));
    }

    @Test
    public void 글작성() {
        //given, when
        Post post = postService.findById((long)1);

        //then
        assertEquals("제목", post.getTitle());
        assertEquals("내용", post.getContent());
    }
}