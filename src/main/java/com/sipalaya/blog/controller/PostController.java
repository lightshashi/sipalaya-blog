package com.sipalaya.blog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shashi
 * @version 1.0.0
 * @since 5/1/24 5:36 AM
 */

@Controller
@RequestMapping("/sipalaya/blog/posts")
@RequiredArgsConstructor
public class PostController {

    @GetMapping
    public String getCreatePostPage(Model model) {
        return "post/create-post";
    }
}
