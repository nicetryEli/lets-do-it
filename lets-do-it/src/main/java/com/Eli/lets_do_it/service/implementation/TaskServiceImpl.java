package com.Eli.lets_do_it.service.implementation;

import java.util.List;
import com.Eli.lets_do_it.model.Task;
import com.Eli.lets_do_it.repository.TaskRepository;
import org.springframework.stereotype.Service;
import com.Eli.lets_do_it.service.interfaces.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository task_repository;

    public TaskServiceImpl(TaskRepository task_repository){
        this.task_repository = task_repository;

    }

    @Override
    public List<Task> getAllTask(){
        return task_repository.findAll();
    }

    @Override
    public Task getTaskById(Integer id){
        return task_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @Override
    public Task createTask(Task task){
        return task_repository.save(task);
    }

    @Override
    public Task deleteTaskById(Integer id){
        Task task = task_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task_repository.delete(task);
        return task;
    }

    @Override
    public Task updateTask(Integer id, Task task){
        Task existingTask = task_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        existingTask.setTitle(task.getTitle());
        existingTask.setCompleted(task.isCompleted());
        existingTask.setDuplicate(task.isDuplicate());

        return task_repository.save(existingTask);
    }
}
