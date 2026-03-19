package es.codeurjc.postcredits;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {
    
    @GetMapping("/sign-up")
    public String home(Model model) {

        return "sign_up";
    }

}
