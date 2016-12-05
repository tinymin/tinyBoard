package com.tinyboard.repository;

import com.tinyboard.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by SuncheolKim on 2016. 12. 5..
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findById(long id);
}
