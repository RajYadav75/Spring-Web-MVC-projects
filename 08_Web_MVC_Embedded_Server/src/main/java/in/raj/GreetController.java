package in.raj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
    @GetMapping("/welcome")
    public String m1(Model model){
        model.addAttribute("msg", "Good Morning");
        return "index";
    }
}
