package com.example.coco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public ModelAndView index() {
        final var modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
