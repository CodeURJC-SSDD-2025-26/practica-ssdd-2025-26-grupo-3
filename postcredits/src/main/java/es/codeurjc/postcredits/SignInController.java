package es.codeurjc.postcredits;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class SignInController {

    @GetMapping("/sign-in")
    public String home(Model model) {

        model.addAttribute("sign-up", true);
        
        return "sign_in";
    }

}
