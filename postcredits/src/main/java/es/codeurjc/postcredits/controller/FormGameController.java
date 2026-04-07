package es.codeurjc.postcredits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class FormGameController {
    @GetMapping("/form_game")
    public String formGame(Model model){
        return "form_game";
    }

}
