package com.example.todo.repository.task;

import com.example.todo.service.task.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TaskRepository {
    
    @Select("SELECT id, summary, description, status FROM tasks;")
    List<TaskEntity> select();

    @Select("SELECT id, summary, description, status FROM tasks WHERE id = #{taskId}")
    Optional<TaskEntity> selectById(@Param("taskId") long taskId);
}
