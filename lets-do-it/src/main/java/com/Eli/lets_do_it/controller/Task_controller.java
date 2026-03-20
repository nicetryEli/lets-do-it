package com.Eli.lets_do_it.controller;

import com.Eli.lets_do_it.model.Task_model;
import com.Eli.lets_do_it.service.interfaces.Tasks_service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class Task_controller {

    private final Tasks_service tasks_service;

    public Task_controller(Tasks_service tasks_service) {
        this.tasks_service = tasks_service;
    }

    @GetMapping
    public List<Task_model> getAllTasks() {
        return tasks_service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task_model getTaskById(@PathVariable Long id) {
        return tasks_service.getTaskById(id);
    }

    @PostMapping
    public Task_model createTask(@RequestBody Task_model task) {
        return tasks_service.createTask(task);
    }

    @PutMapping("/{id}")
    public Task_model updateTask(@PathVariable Long id, @RequestBody Task_model task) {
        return tasks_service.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public Task_model deleteTask(@PathVariable Long id) {
        return tasks_service.deleteTaskById(id);
    }
}
