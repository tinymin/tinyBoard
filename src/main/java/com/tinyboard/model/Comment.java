package com.tinyboard.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@Entity
@Getter
@ToString
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    private String contents;
    private String author;
    private String password;
    private Long   postId;

    public Comment() {}

    public Comment(String contents, String author, String password, Long postId) {
        this.contents = contents;
        this.author = author;
        this.password = password;
        this.postId = postId;
    }
}
