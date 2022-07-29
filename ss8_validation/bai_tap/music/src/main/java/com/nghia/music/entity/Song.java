package com.nghia.music.entity;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class Song {
    @NotEmpty
    @Size(max = 800)
    private String name;

    @NotEmpty
    @Size(max = 300)
    private String author;

    @NotEmpty
    @Size(max = 1000)
    private String category;

    public Song() {
    }

    public Song(@NotEmpty @Size(max = 800) String name,
                @NotEmpty @Size(max = 300) String author,
                @NotEmpty @Size(max = 1000) String category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
