package com.Eli.lets_do_it.controller;

import com.Eli.lets_do_it.model.Category;
import com.Eli.lets_do_it.model.Task;
import com.Eli.lets_do_it.service.interfaces.CategoryService;
import com.Eli.lets_do_it.service.interfaces.UserService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategory(){return categoryService.getAllCategory();}

    @GetMapping("/{id}")
    public List<Task> getAllTask(@RequestBody Category category){
        return categoryService.getAllTaskFromCategory(category);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category){return categoryService.createCategory(category);}

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Integer id, @RequestBody Category category){
        return categoryService.updateCategory(id,category);
    }

    @DeleteMapping("/{id}")
    public Category deleteCategory(@PathVariable Integer id){
        return categoryService.deleteCategory(id);
    }
}
