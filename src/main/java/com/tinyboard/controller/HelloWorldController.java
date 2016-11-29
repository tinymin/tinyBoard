package com.tinyboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Map<String, Object> model) {
        model.put("name", "Hello Suncheol");

        return "HelloWorld";
    }

    @GetMapping("/")
    public String defaultPage(Map<String, Object> model) {
        return "default";
    }
}
