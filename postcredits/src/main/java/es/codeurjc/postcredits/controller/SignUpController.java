package es.codeurjc.postcredits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {
    
    @GetMapping("/sign_up")
    public String signUp(Model model) {

        model.addAttribute("sign_in", true);
        
        return "sign_up";
    }

}
