package com.nghia.controller;

import com.nghia.entity.Blog;
import com.nghia.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("blogList2", blogService.findAll());
        return "test";
    }
    @GetMapping("/create")
    public ModelAndView showFormCreate(Model model) {
        ModelAndView modelAndView = new ModelAndView("/create");
        model.addAttribute("blog", new Blog());
        return modelAndView;
    }

    @GetMapping("/test")
    public String showListt(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "test";
    }
}
