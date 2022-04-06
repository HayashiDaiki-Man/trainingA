package com.example.taskdemo;
import com.example.taskdemo.HomeController.TaskItem;
import org.springframework.stereotype.Service;
import org.springframework.core.JdbcTemplate;

@Service
public class TaskListDao {
    private final  JdbcTemplate jdbcTemplate;
}
