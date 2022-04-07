package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    // GetMappingで入力された情報を取得して（readFormメソッドの情報）
    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }
    // PostMappingで返している（confirmメソッドを返している）
    @PostMapping("/form")
    private String confirm(@ModelAttribute User user) {
        return "confirm";
    }
}
