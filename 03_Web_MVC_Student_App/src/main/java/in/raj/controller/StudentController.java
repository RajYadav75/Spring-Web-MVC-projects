package in.raj.controller;

import in.raj.binding.Student;
import in.raj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;
    @GetMapping("/")
    public String loadIndexPage(Model model){

        init(model);
        return "index";
    }

    private void init(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("courses", service.getCourses());
        model.addAttribute("timings",service.getTimings());
    }

    @PostMapping("/save")
    public String saveStudent(Student s,Model model){
        System.out.println(s);

        boolean isSaved = service.saveStudent(s);
        if(isSaved)
            model.addAttribute("msg","Data Saved..");
        init(model);
        return "index";
    }
}
