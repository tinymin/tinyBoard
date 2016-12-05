package com.tinyboard.service;

import com.tinyboard.dto.CommentCreateDTO;
import com.tinyboard.model.Comment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentServiceTest {
    @Autowired
    CommentService commentService;

    @Before
    public void setup() {
        Comment comment1 = commentService.write(new CommentCreateDTO("댓글이 이따구네", "철", "1234", (long) 1));
        Comment comment2 = commentService.write(new CommentCreateDTO("댓글22", "철", "1234", (long) 1));
        Comment comment3 = commentService.write(new CommentCreateDTO("", "", "", (long) 2));
    }

    @Test
    public void 댓글생성() {
        //given, when
        List<Comment> comments = commentService.findByPostId((long)1);

        //then
        assertEquals("댓글이 이따구네", comments.get(0).getContents());
        assertEquals("댓글22", comments.get(1).getContents());
    }

    @Test
    public void 댓글삭제() {
        //given, when
        Comment comment = commentService.findByIdAndPostId((long)1, (long)1);

        //then
        assertEquals("댓글이 이따구네", comment.getContents());
        commentService.delete(comment);
        comment = commentService.findByIdAndPostId((long)1, (long)1);
        assertEquals(null, comment);
    }
}
