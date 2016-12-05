package com.tinyboard.repository;

import com.tinyboard.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findByIdAndPostId(Long id, Long postId);

    List<Comment> findAllByPostId(Long postId);
}
