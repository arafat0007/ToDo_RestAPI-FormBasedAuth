package com.example.ToDo.DTOs;

import com.example.ToDo.Domain.TaskPriority;
import com.example.ToDo.Domain.TaskStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class TaskDTO {
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private String Tag;
}
