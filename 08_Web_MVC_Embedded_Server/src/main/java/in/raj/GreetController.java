package in.raj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class GreetController {
    @GetMapping("/hello")
    public String m1(Model model){
        model.addAttribute("msg", "Good Morning");
        return "index";
    }
}
