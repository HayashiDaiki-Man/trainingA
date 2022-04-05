package com.example.tsk;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    // hello.htmlをリクエスト
    @RequestMapping("/hello")
    /*
     * addAttributeで属性を設定している
     * Model = time;
     * model = LocalDateTime.now();
     * という感じ、後でHTMLのほうで${time}と書いたところに反映される
     */
    String hello(Model model) {
        model.addAttribute("time", LocalDateTime.now().toString().substring(11, 16));
        return "hello";
    }

    // TaskItemレコードを作成。レコードなのでアッパーキャメルケース
    record TaskItem(String id, String task, String deadline, boolean done) {
    }

    // レコードをリストに格納
    private List<TaskItem> taskItems = new ArrayList<>();

    @GetMapping("/list")
    String listItems(Model model) {
        model.addAttribute("taskList", taskItems);
        return "home";
    }

    @GetMapping("/add")
    String addItem(@RequestParam("task") String task,@RequestParam("deadline") String deadline) {
        String id = UUID.randomUUID().toString().substring(0, 8);
        TaskItem item = new TaskItem(id, task, deadline, false);
        taskItems.add(item);

        return "redirect:/list";
    }
}
