package com.tinyboard.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by SuncheolKim on 2016. 12. 5..
 */
@Entity
@Getter
@ToString
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;
    private String regDate;
    private String author;
    private String password;
    private String tag;

    public Post() {}

    public Post(String title, String content, String regDate, String author, String password, String tag) {
        this.title = title;
        this.content = content;
        this.regDate = regDate;
        this.author = author;
        this.password = password;
        this.tag = tag;
    }
}
