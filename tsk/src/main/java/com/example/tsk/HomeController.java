package com.example.tsk;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/hello")
    String hello(Model model) {
        model.addAttribute("time",LocalDateTime.now().toString().substring(11,16));
        return "hello";
    }
}
