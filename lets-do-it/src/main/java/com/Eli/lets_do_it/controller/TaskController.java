package com.Eli.lets_do_it.controller;

import com.Eli.lets_do_it.model.Task;

import com.Eli.lets_do_it.service.interfaces.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAll(){
        return taskService.getAllTask();
    }

    @DeleteMapping("/{taskId}")
    public Task deleteTask(@PathVariable Integer taskId){
        return taskService.deleteTaskById(taskId);
    }

    @PostMapping
    public Task addTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping("/{taskId}")
    public Task updateTask(@PathVariable Integer taskId, @RequestBody Task task){return taskService.updateTask(taskId, task);}

    @GetMapping("/{taskId}")
    public Task getTaskById(@PathVariable Integer taskId){return taskService.getTaskById(taskId);}
}
