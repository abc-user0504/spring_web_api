package com.example.todo.controller.task;

import com.example.todo.service.task.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;

public record TaskForm(

    @NotBlank
    @Size(max = 256, message = "less than 256 words")
    String summary,

    String description,

    @NotBlank
    @Pattern(regexp="TODO|DOING|DONE", message = "you need to enter in ('TODO', 'DOING', 'DONE')")
    String status
) {
   public TaskEntity toEntity() {
        return new TaskEntity(null, summary(), description(), TaskStatus.valueOf(status()));
   } 
}
