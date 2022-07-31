package codegym.vn.springboot.controller;

import codegym.vn.springboot.entity.ClassName;
import codegym.vn.springboot.entity.Student;
import codegym.vn.springboot.service.ClassNameService;
import codegym.vn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    // setter injection: cách triển khai ngắn gọn, hay dùng
    @Autowired
//    @Qualifier("studentServiceImpl")
    private StudentService service;

    @Autowired
    private ClassNameService classNameService;
    // triển khai setter injection đầy đủ
//    @Autowired
//    @Qualifier("studentService1")
//    public void setService(StudentService service) {
//        this.service = service;
//    }

    @GetMapping(value = "/list"
//        consumes = {MediaType.APPLICATION_JSON_VALUE}
//            ,headers = {"Content-Type=text/html","Accept=application/xml"}
            )
    public String list(Model model) {
        List<Student> students = service.findAll();
        model.addAttribute("students", students);
        return "student/list";
    }

//    @GetMapping("/view/{student_id}")
//    public String viewStudent(@PathVariable("student_id") String id, Model model) {
//        Student student = service.findById(id);
//        model.addAttribute("student", student);
//        return "/student/view";
//    }

    // Dùng formatter
    @GetMapping("/view/{student_id}")
    public String viewStudent(@PathVariable("student_id") Student student, Model model) {
        model.addAttribute("student", student);
        return "/student/view";
    }

    @GetMapping("/update/{student_id}")
    public String updateStudent(@PathVariable("student_id") Student student, Model model) {
        List<ClassName> classNames = classNameService.findAll();
        model.addAttribute("classNames", classNames);
        model.addAttribute("student", student);
        return "/student/create";
    }

    @GetMapping("/view")
    public String viewStudentByParam(@RequestParam("id") String id, Model model) {
        Student student = service.findById(id);
        model.addAttribute("student", student);
        return "/student/view";
    }

    @GetMapping("/create")
    public String viewCreate(Model model) {
        List<ClassName> classNames = classNameService.findAll();
        Student student = new Student();
        student.setClassName(new ClassName());
        model.addAttribute("student", student);
        model.addAttribute("classNames", classNames);
        return "/student/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("student") Student student) {
        service.create(student);
        return "redirect:/student/list";
    }

    @PostMapping("/create2")
    public String create2(@RequestParam("id") String id,
                          @RequestParam("name") String name
                          ,RedirectAttributes redirectAttributes
    ) {
        Student student = new Student(id, name);
        service.create(student);
        System.out.println("Create student success");
        redirectAttributes.addFlashAttribute("students", service.findAll());
        return "redirect:/student/list2";
    }

    @GetMapping(value = "/list2")
        public String list2(Model model) {
        return "student/list";
    }
}
