package nghia.codegym.controller;

import nghia.codegym.repository.LanguageRepo;
import nghia.codegym.repository.LanguageRepoImpl;
import nghia.codegym.service.LanguageService;
import nghia.codegym.service.LanguageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    private LanguageService languageService = new LanguageServiceImpl();

    @GetMapping("/dictionary")
    public String homePage() {
        return "home";
    }

    @PostMapping("/dictionary")
    public String translated(@RequestParam String English, Model model) {
        model.addAttribute("english", English);
        String result = languageService.translate(English);
        model.addAttribute("result", result);
        return "home";
    }
}
