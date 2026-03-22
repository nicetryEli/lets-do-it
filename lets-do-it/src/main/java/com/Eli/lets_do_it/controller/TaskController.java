package com.Eli.lets_do_it.controller;

import com.Eli.lets_do_it.model.Task;

import com.Eli.lets_do_it.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTask(){
        return  taskRepository.findAll();
    }

    @PostMapping
    public Task addTask(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @PutMapping("/{task_id}")
    public Task updateTask(@PathVariable Integer task_id, @RequestBody Task taskDetails){
        Task existingTask = taskRepository.findById(task_id).orElseThrow(()-> new RuntimeException("can't find task to update!"));
        existingTask.setTitle((taskDetails.getTitle()));
        existingTask.setCompleted(taskDetails.isCompleted());
        existingTask.setPriority(taskDetails.getPriority());
        existingTask.setDueDate(taskDetails.getDueDate());

        return taskRepository.save(existingTask);
    }

    @DeleteMapping("/{task_id}")
    public String deleteTask(@PathVariable Integer task_id){
        taskRepository.deleteById(task_id);
        return "deleted id " + task_id;
    }
}
