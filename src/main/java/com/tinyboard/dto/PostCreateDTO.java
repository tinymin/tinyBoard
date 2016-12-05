package com.tinyboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by SuncheolKim on 2016. 12. 5..
 */
@Data
@AllArgsConstructor
public class PostCreateDTO {
    private String title;
    private String content;
    private String regDate;
    private String author;
    private String password;
    private String tag;
}
