package es.codeurjc.postcredits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {
    @GetMapping("/user_profile")
    public String userProfile(Model model) {
        return "user_profile";
    }

}
