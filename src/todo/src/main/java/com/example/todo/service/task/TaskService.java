package com.example.todo.service.task;

import org.springframework.stereotype.Service;

import com.example.todo.repository.task.TaskRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    
    private final TaskRepository taskRepository;

    public List<TaskEntity> find() {
        return taskRepository.select();
    }
}
