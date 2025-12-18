package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TaskController {

    @GetMapping
    public String index() {
        return "index";
    }
    
    @GetMapping("/tasks")
    public String list(Model model) {
        var task = new TaskDTO(1L, "Learn Spring Boot", "create todo app with spring boot", "TODO");
        model.addAttribute("task", task);
        return "tasks/list";
    }
}
