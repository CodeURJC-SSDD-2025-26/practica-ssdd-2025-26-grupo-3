package es.codeurjc.postcredits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormBookController {
    @GetMapping("/form_book")
    public String formBook(Model model){
        return "form_book";
    }
}
