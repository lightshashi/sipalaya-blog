package com.sipalaya.blog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shashi
 * @version 1.0.0
 * @since 4/29/24 9:11 PM
 */

@Controller
@RequestMapping("/sipalaya/blog")
@RequiredArgsConstructor
public class DefaultController {

    @GetMapping
    public String getIndexPage(Model model) {
        return "index";
    }
}
