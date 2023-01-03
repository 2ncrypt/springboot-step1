package step1.step1spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Step1Controller {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data" , "Hello!!");
        return "hello";
    }
}
