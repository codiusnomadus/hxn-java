package com.hxn.blog.controller;


import com.hxn.blog.model.Blog;
import com.hxn.blog.service.BlogService;
import com.hxn.category.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/categories/{categoryId}")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blogs")
    public List<Blog> index(@PathVariable String categoryId) {
            return blogService.getAllBlogs(categoryId);
    }

    @GetMapping("/blogs/{id}")
    public Optional<Blog> show(@PathVariable String id) {
        return blogService.getBlog(id);
    }

    @PostMapping("/blogs")
    public void create(@RequestBody Blog blog, @PathVariable Category categoryId) {
        blog.setCategory(categoryId);
        blogService.addBlog(blog);
    }

    @PutMapping("/blogs/{id}")
    public void update(@RequestBody Blog blog, @PathVariable String  id) {
        blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/blogs/{id}")
    public void delete(@PathVariable String id) {
        blogService.deleteBlog(id);
    }
}
