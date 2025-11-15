package com.example.todo.service.task;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.example.todo.repository.task.*;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    
    private final TaskRepository taskRepository;

    public List<TaskEntity> find() {
        return taskRepository.select();        
    }

    public Optional<TaskEntity> findById(long taskId) {
        return taskRepository.selectById(taskId);
    }

    @Transactional
    public void create(TaskEntity newEntity) {
        taskRepository.insert(newEntity);
    }

    @Transactional
    public void update(TaskEntity entity) {
        taskRepository.update(entity);
    }

    @Transactional
    public void delete(long taskId) {
        taskRepository.delete(taskId);
    }
}
