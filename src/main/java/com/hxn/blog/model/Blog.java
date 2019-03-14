package com.hxn.blog.model;

import com.hxn.category.model.Category;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Blog {


    @Id
    private String id;
    private String title;
    private String body;

    @ManyToOne
    @JoinColumn
    private Category category;

    public Blog() { }

    public Blog(String id, String title, String body) {
        super();
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
