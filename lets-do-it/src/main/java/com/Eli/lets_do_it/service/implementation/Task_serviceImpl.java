package com.Eli.lets_do_it.service.implementation;

import java.util.List;
import com.Eli.lets_do_it.model.Task_model;
import com.Eli.lets_do_it.repository.Task_repository;
import org.springframework.stereotype.Service;
import com.Eli.lets_do_it.service.interfaces.Tasks_service;

@Service
public class Task_serviceImpl implements Tasks_service {
    private final Task_repository task_repository;

    public Task_serviceImpl(Task_repository task_repository){
        this.task_repository = task_repository;

    }

    @Override
    public List<Task_model> getAllTasks(){
        return task_repository.findAll();
    }

    @Override
    public Task_model getTaskById(Long id){
        return task_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @Override
    public Task_model createTask(Task_model task){
        return task_repository.save(task);
    }

    @Override
    public Task_model deleteTaskById(Long id){
        Task_model task = task_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task_repository.delete(task);
        return task;
    }

    @Override
    public Task_model updateTask(Long id, Task_model task){
        Task_model existingTask = task_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        existingTask.setTitle(task.getTitle());
        existingTask.setCompleted(task.isCompleted());
        existingTask.setDuplicate(task.isDuplicate());

        return task_repository.save(existingTask);
    }
}
