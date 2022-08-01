package com.nghia.controller;

import com.nghia.entity.Cart;
import com.nghia.entity.Product;
import com.nghia.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart createCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop(){
        ModelAndView modelAndView = new ModelAndView("shop");
        modelAndView.addObject("products",productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable("id") Long id , @ModelAttribute("cart") Cart cart, @RequestParam("action") String action , RedirectAttributes redirectAttributes){
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()){
            return "error-404";
        }
        if (action.equals("show"))

    }

}
