package com.nghia.controller;

import com.nghia.entity.Blog;
import com.nghia.service.IBlogService;
import com.nghia.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping("/list")
    public String showList(Model model , @RequestParam(value = "page", defaultValue = "0") int page ) {
        model.addAttribute("blogList", blogService.findAll(PageRequest.of(page,5, Sort.by("year"))));
        return "views/list";
    }

//    @GetMapping("/list")
//    public String showList(Model model , @RequestParam(value = "page", defaultValue = "0") int page ) {
//        model.addAttribute("blog", blogService.findAll(PageRequest.of(page,5, Sort.by("year"))));
//        return "views/list";
//    }


    @GetMapping("/create")
    public ModelAndView showFormCreate(Model model) {
        ModelAndView modelAndView = new ModelAndView("views/create");
        model.addAttribute("category", categoryService.findAll());
        model.addAttribute("blog", new Blog());
        return modelAndView;
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String viewEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("category", categoryService.findAll());
        model.addAttribute("blog", blogService.findById(id));
        return "views/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/views/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "views/view";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        blogService.deleteById(id);
        return "redirect:/list";
    }
    @GetMapping("/list/search")
    public String search(@RequestParam("name") String name,
                         @RequestParam(value = "page" ,defaultValue = "0") int page,Model model ){
        Page<Blog> blog = blogService.searchByName(name,PageRequest.of(page,5));
        model.addAttribute("name",name);
        model.addAttribute("blogList",blog);
        return "views/list";
    }
}
