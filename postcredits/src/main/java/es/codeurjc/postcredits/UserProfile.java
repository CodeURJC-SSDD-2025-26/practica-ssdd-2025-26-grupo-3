package es.codeurjc.postcredits;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfile {
    @GetMapping("/user_profile")
    public String userProfile(Model model) {
        return "user_profile";
    }

}
