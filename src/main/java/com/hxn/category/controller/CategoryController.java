package com.hxn.category.controller;


import com.hxn.category.model.Category;
import com.hxn.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public List<Category> index() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Category> show(@PathVariable String id) {
        return categoryService.getCategory(id);
    }

    @PostMapping("/")
    public void create(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Category category, @PathVariable String  id) {
        categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        categoryService.deleteCategory(id);
    }
}
