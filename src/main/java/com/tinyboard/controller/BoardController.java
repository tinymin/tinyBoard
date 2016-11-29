package com.tinyboard.controller;

import com.tinyboard.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@Controller
public class BoardController {
    @Autowired
    private CommentService commentService;

    @GetMapping(value = "/comment/{postId:[0-9]+}")
    public String viewComment(@PathVariable("postId") Long postId
                              ,Map<String, Object> model) {

        model.put("name", "Suncheol Kim");
        return "HelloWorld";
    }

    @GetMapping(value = "/post/{postId:[0-9]+}/writecomment")
    public String writeComment(@PathVariable("postId") Long postId
                              ,Map<String, Object> model) {
        return "default";
    }
}
