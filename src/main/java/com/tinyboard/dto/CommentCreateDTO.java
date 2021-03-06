package com.tinyboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@Data
@AllArgsConstructor
public class CommentCreateDTO {
    private String content;
    private String author;
    private String password;
    private Long   postId;
}
