package com.example.coco.controller;

import com.example.coco.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @GetMapping("/users")
    public ModelAndView list() {
        final var modelAndView = new ModelAndView("user/list");
        modelAndView.addObject("userList", userService.getUserList());
        return modelAndView;
    }
}
