package com.codegym.controller;

import com.codegym.dto.StudentAccountDTO;
import com.codegym.model.Account;
import com.codegym.model.Student;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private IStudentService iStudentService;

//    @RequestMapping(method = RequestMethod.GET, value = "/list")
    @GetMapping(value = "/list")
    public String getAllStudent(Model model) {
        List<Student> list = iStudentService.getAll();
        model.addAttribute("listStudent", list);
        return "list";
    }

    @GetMapping("/create")
    public String movePageCreate(Model model) {
        model.addAttribute("student", new StudentAccountDTO());
        String[] classroom = new String[] {"c0222g1","c0422g1", "c0222g2"};
        model.addAttribute("listClass", classroom);
        return "create";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute("student")StudentAccountDTO studentAccountDTO,
                                RedirectAttributes redirectAttributes) {
        Student student = new Student(studentAccountDTO.getCodeStudent(), studentAccountDTO.getNameStudent(),
                studentAccountDTO.getPoint(), studentAccountDTO.getGender());
        Account account = new Account(studentAccountDTO.getUsername(), studentAccountDTO.getPassword());

        iStudentService.save(student);
//        List<Student> list = iStudentService.getAll();
//        model.addAttribute("listStudent", list);
        redirectAttributes.addFlashAttribute("msg","Thêm mới thành công");
        return "redirect:/list";
    }
    @GetMapping("/detail/{codeStudent}")
    public String moveDetail(@PathVariable(value = "codeStudent", required = false)Integer codeStudent, Model model) {
        Student student = iStudentService.findById(codeStudent);
        model.addAttribute("student", student);
        return "detail";
    }

}
