package com.hxn.blog.repository;

import com.hxn.blog.model.Blog;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepository extends CrudRepository<Blog, String> {
    public List<Blog> findByCategoryId(String categoryId);
}
