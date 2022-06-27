package nghia.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping(value = "/sandwich")
    public String display() {
        return "index";
    }

    @PostMapping(value = "/save")
    public String save(@RequestParam("condiment") String[] condimentArray , Model model) {
        model.addAttribute("condimentArray",condimentArray);
        return "success";
    }
}
