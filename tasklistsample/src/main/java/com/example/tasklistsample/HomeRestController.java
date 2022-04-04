package com.example.tasklistsample;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    record TaskItem(String id,String task,String deadline,boolean done){}
    private List<TaskItem> taskItems = new ArrayList<>();

    @RequestMapping("/resthello")
    String hello(){
        return """
                Hello.
                現在時刻は%sです
                """.formatted(LocalDateTime.now().toString().substring(11,16));
    }
    // タスクを追加するエンドポイントを作成
    @GetMapping("/restadd")
String addItem(@RequestParam("task") String task,@RequestParam("deadline") String deadline) {
    // UUIDは全世界でかぶらないIDだと思っとく
    // toStringは文字列への変換
    // subStringは切り出し
    String id = UUID.randomUUID().toString().substring(0,8);
    TaskItem item = new TaskItem(id, task, deadline, false);
    taskItems.add(item);

    return "タスクを追加しました";
}
@GetMapping("/restlist")
String listItems(){
    String result = taskItems.stream().map(TaskItem::toString).collect(Collectors.joining(", "));
    return result;
}
}