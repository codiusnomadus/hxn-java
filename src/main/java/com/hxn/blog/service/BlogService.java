package com.hxn.blog.service;

import com.hxn.blog.model.Blog;
import com.hxn.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> getAllBlogs(String categoryId) {
        // return blogs;
        List<Blog> blogs = new ArrayList<>();
        blogRepository.findByCategoryId(categoryId).forEach(blogs::add);
        return blogs;

    }

    public Optional<Blog> getBlog(String id) {
        return blogRepository.findById(id);
    }

    public void addBlog(Blog blog) {
        blogRepository.save(blog);
    }

    public void updateBlog(String id, Blog blog) {
        blogRepository.save(blog);
    }

    public void deleteBlog(String id) {
        blogRepository.deleteById(id);
    }
}
