package com.hxn.category.model;

import com.hxn.blog.model.Blog;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    private String id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Blog> blogs;

    public Category() { }

    public Category(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
