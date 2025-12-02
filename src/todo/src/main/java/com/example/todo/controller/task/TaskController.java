package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class TaskController {
    
    @GetMapping("/tasks")
    public String list(Model model) {
        var task1 = new TaskDTO(1L, "learn Spring Boot", "make TODO App", "TODO");
        var task2 = new TaskDTO(2L, "learn Spring Security", "make login func", "TODO");
        var taskList = List.of(task1, task2);
        model.addAttribute("taskList", taskList);
        return "tasks/list";
    }
}
