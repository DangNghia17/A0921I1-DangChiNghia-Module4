package com.nghia.controller;

import com.nghia.entity.Email;
import com.nghia.service.ILanguageService;
import com.nghia.service.LanguageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LanguageController {
    ILanguageService languageService = new LanguageServiceImpl();
    public Email saveEmail = new Email();

    @ModelAttribute("createEmail")
    public Email createEmail() {
        return new Email();
    }

    @GetMapping("/display")
    public ModelAndView display(@ModelAttribute("createEmail") Email email, Model model) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("createEmail", saveEmail);
        modelAndView.addObject("language", languageService.languageAllList());
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView save(@ModelAttribute("createEmail") Email email, Model model) {
        saveEmail = email;
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("language", languageService.languageAllList() );
        model.addAttribute("email", email);
        return modelAndView;
    }
}
