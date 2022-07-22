package com.nghia.controller;

import com.nghia.entity.Blog;
import com.nghia.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "test";
    }
    @GetMapping("/create")
    public ModelAndView showFormCreate(Model model) {
        ModelAndView modelAndView = new ModelAndView("/create");
        model.addAttribute("blog", new Blog());
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public String viewEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog) {
        blogService.update(blog);
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        blogService.delete(id);
        return "redirect:/list";
    }
}
