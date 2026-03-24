package com.Eli.lets_do_it.controller;

import com.Eli.lets_do_it.model.Task;

import com.Eli.lets_do_it.repository.TaskRepository;
import com.Eli.lets_do_it.service.interfaces.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<Task> getAll(){
        return taskService.getAllTask();
    }

    @DeleteMapping("/{task_id}")
    public Task deleteTask(@PathVariable Integer task_id){
        return taskService.deleteTaskById(task_id);
    }

    @PostMapping
    public Task addTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping("/{task_id}")
    public Task updateTask(@PathVariable Integer task_id, Task task){return taskService.updateTask(task_id, task);}

    @GetMapping("/{task_id}")
    public Task getTaskById(@PathVariable Integer task_id){return taskService.getTaskById(task_id);}
}
