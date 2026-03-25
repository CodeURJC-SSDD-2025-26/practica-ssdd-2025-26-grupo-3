package es.codeurjc.postcredits;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("admin", true);
        model.addAttribute("sign_in",true);
        model.addAttribute("sign_up",true);
        model.addAttribute("search_bar", true);
        model.addAttribute("user", true);

        return "home";
    }
    
}
