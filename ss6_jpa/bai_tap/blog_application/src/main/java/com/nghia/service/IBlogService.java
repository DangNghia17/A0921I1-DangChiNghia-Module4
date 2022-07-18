package com.nghia.service;

import com.nghia.entity.Blog;

import java.util.List;

public interface IBlogService {
    void create(Blog blog);

    void update(Blog blog);

    void delete(Integer id);

    List<Blog> findAll();

    Blog findById(Integer id);
}
