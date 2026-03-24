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
    List<Task> getAllTaskFromCategory(Integer id);
    Task addTaskToCategory(Integer id, Task task);
    Task deleteTaskFromCategory(Integer cate_id, Integer id);
    Task updateTaskFromCategory(Integer cate_id, Task task);
    Task getTaskByIdFromCate(Integer cate_id, Integer id);
}
