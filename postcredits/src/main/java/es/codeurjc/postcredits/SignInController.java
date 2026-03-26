package es.codeurjc.postcredits;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("/sign_in")
    public String signIn(Model model) {

        model.addAttribute("sign_up", true);
        
        return "sign_in";
    }

}
