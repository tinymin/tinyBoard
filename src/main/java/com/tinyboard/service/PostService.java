package com.tinyboard.service;

import com.tinyboard.dto.PostCreateDTO;
import com.tinyboard.model.Post;
import com.tinyboard.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SuncheolKim on 2016. 12. 5..
 */
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post findById(long id) {
        return postRepository.findById(id);
    }

    public Post write(PostCreateDTO postCreateDTO) {
        Post post = new Post(
                  postCreateDTO.getTitle()
                , postCreateDTO.getContent()
                , postCreateDTO.getRegDate()
                , postCreateDTO.getAuthor()
                , postCreateDTO.getPassword()
                , postCreateDTO.getTag()
        );

        return postRepository.save(post);
    }
}
