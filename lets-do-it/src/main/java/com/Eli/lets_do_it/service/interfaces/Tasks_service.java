package com.Eli.lets_do_it.service.interfaces;

import java.util.List;

import com.Eli.lets_do_it.model.Task_model;


public interface Tasks_service {
    List<Task_model> getAllTasks();
    Task_model getTaskById(Long id);
    Task_model createTask(Task_model task);
    Task_model deleteTaskById(Long id);
    Task_model updateTask(Long id, Task_model task);
}
