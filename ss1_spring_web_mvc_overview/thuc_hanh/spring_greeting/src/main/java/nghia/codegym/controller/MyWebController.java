package nghia.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyWebController {
    @GetMapping("/welcome")
    public String welcome() {
        return "mywebsite";
    }

    @PostMapping("/outdata")
    public String outData(@RequestParam String yourName, @RequestParam String yourAge ,Model model) {
        model.addAttribute("text1", yourName);
        model.addAttribute("text2", yourAge);
        return "mywebsite";
    }
}
