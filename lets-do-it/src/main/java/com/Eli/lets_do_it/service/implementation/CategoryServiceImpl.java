package com.Eli.lets_do_it.service.implementation;

import com.Eli.lets_do_it.model.Category;
import com.Eli.lets_do_it.model.Task;
import com.Eli.lets_do_it.repository.CategoryRepository;
import com.Eli.lets_do_it.repository.TaskRepository;
import com.Eli.lets_do_it.service.interfaces.CategoryService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final TaskRepository taskRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategory(){return categoryRepository.findAll();}

    @Override
    public Category getCategoryById(Integer id){return categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("can't find category!"));}

    @Override
    public Category createCategory(Category category){return categoryRepository.save(category);}

    @Override
    public Category updateCategory(Integer id, Category category){
        Category existingCategory = categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("category does not exist!"));
        existingCategory.setName(category.getName());
        existingCategory.setCreated_at(category.getCreated_at());
        return categoryRepository.save(existingCategory);
    }

    @Override
    public Category deleteCategory(Integer id){
        Category tmp = getCategoryById(id);
        categoryRepository.delete(tmp);
        return  tmp;
    }

    @Override
    public List<Task> getAllTaskFromCategory(Category category){
        return taskRepository.findByCategory(category);
    }

    @Override
    public Task addTaskToCategory(Category category, Task task){
        task.setCategory(category);
        return taskRepository.save(task);
    }
}
