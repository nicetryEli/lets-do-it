package com.Eli.lets_do_it.service.interfaces;

import com.Eli.lets_do_it.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTask();
    Task getTaskById(Integer id);
    Task deleteTaskById(Integer id);
    Task updateTask(Integer id, Task task);
}
