package com.example.ToDo.Controllers;

import com.example.ToDo.DTOs.TaskDTO;
import com.example.ToDo.Services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<TaskDTO> getAllTasks(ModelMap model){
        return taskService.getAllTask(model);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/create")
    public TaskDTO createTask(@RequestBody TaskDTO taskDTO, ModelMap model){
        return taskService.createTask(taskDTO, model);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "/{taskId}")
    public TaskDTO editTask(@PathVariable long taskId, @RequestBody TaskDTO taskDTO, ModelMap model){
        return taskService.editTask(taskId,taskDTO, model);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/{taskId}")
    public TaskDTO showTask(@PathVariable long taskId, ModelMap model) {
        return taskService.showTask(taskId, model);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(path = "/{taskId}")
    public void deleteTask(@PathVariable long taskId, ModelMap model) {
        taskService.deleteTask(taskId, model);
    }
}