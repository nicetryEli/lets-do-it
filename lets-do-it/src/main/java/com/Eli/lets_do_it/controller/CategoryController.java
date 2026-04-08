package com.Eli.lets_do_it.controller;

import com.Eli.lets_do_it.model.Category;
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

    @PostMapping
    public Category createCategory(@RequestBody Category category){return categoryService.createCategory(category);}
}
