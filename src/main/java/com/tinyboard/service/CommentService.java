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

    public Comment findByIdAndPostId(Long id, Long postId) {
        return commentRepository.findByIdAndPostId(id, postId);
    }

    public List<Comment> findByPostId(Long postId) {
        return commentRepository.findAllByPostId(postId);
    }

    public Comment write(CommentCreateDTO commentCreateDTO) {
        Comment comment = new Comment(commentCreateDTO.getContent(), commentCreateDTO.getAuthor(), commentCreateDTO.getPassword(), commentCreateDTO.getPostId());
        return commentRepository.save(comment);
    }

    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }
}
