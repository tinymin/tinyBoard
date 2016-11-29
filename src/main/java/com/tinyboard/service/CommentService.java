package com.tinyboard.service;

import com.tinyboard.dto.CommentCreateDTO;
import com.tinyboard.model.Comment;
import com.tinyboard.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public List<Comment> findByPostId(long postId) {
        return commentRepository.findByPostId(postId);
    }

    public Comment write(CommentCreateDTO commentCreateDTO) {
        Comment comment = new Comment(commentCreateDTO.getContent(), commentCreateDTO.getAuthor(), commentCreateDTO.getPassword(), commentCreateDTO.getPostId());
        return commentRepository.save(comment);
    }
}
