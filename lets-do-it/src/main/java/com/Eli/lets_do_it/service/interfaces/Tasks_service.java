package com.Eli.lets_do_it.service.interfaces;

import java.util.List;

import com.Eli.lets_do_it.model.Task;


public interface Tasks_service {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
    Task deleteTaskById(Long id);
    Task updateTask(Long id, Task task);
}
