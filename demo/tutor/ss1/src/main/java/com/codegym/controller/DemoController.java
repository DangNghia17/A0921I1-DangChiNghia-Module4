package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/test")
    public String testError( @RequestParam String test ){
        return "hello";
    }

//    @RequestParam dùng để nhận tham số từ view gửi về
//    model dùng để truyền dữ liệu từ controller -> View
    @PostMapping("/bye")
    public String receivedData(@RequestParam String something, Model model){
        model.addAttribute("text", something);
        System.out.println(something);
        return "hello";
    }
}
