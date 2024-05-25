package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgContoller {
    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","Welcome to the Raj Yadav Technology");
        mv.setViewName("message");
        return mv;
    }
    @GetMapping("/greet")
    public ModelAndView getGreetMsg(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Good Evening........");
        mv.setViewName("message");
        return mv;
    }
}
