package com.nghia.controller;

import com.nghia.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;


}
