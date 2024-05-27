package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

    @GetMapping("/")
    public String getWelcome(Model model) {
        model.addAttribute("msg", "Welcome To Thymeleaf Pages");
        return "index";
    }
    @GetMapping("/greet")
    public String getGreeting(Model model) {
        model.addAttribute("msg", "Good Evening");
        return "index";
    }
}
