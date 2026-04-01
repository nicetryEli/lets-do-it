package com.Eli.lets_do_it.service.interfaces;

import com.Eli.lets_do_it.model.Category;
import com.Eli.lets_do_it.model.Task;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    Category getCategoryById(Integer id);
    Category createCategory(Category cate);
    Category updateCategory(Integer id, Category category);
    Category deleteCategory(Integer id);
    List<Task> getAllTaskFromCategory(Category category);
    Task addTaskToCategory(Category category, Task task);
    Task deleteTaskFromCategory(Category category, Integer id);
    Task updateTaskFromCategory(Category category, Task task);
    Task getTaskFromCategory(Category category, Integer id);
}
