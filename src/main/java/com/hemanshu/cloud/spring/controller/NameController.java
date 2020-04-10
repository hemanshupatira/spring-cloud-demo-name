package com.hemanshu.cloud.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NameController {
    private final String name;

    public NameController(@Value("${name}") String name) {
        this.name = name;
    }

    @GetMapping("/")
    public @ResponseBody
    String getName() {
        return name;
    }
}
