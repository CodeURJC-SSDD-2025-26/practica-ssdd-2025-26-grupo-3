package es.codeurjc.postcredits;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPanel {
    @GetMapping("/admin_panel")
    public String adminPanel(Model model) {
        return "admin_panel";
    }

}
