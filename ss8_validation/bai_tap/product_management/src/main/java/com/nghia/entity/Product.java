package com.nghia.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity(name = "product")
public class Product {
    @Id
    @Column(columnDefinition = "varchar(45)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
    @Pattern(regexp = "^[0-9]*$",message = "Price must be number only")
    @NotBlank
    private double price;
    @Length(max = 300)
    private String description;
    private String factory;

    public Product() {
    }

    public Product(Integer id, @NotBlank String name, @Pattern(regexp = "^[0-9]*$",
            message = "Price must be number only")
    @NotBlank double price, @Length(max = 300) String description, String factory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.factory = factory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}
