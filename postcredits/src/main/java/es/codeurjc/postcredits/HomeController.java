package es.codeurjc.postcredits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired ListService listService;

    @GetMapping("/")
    public String home(Model model,@RequestParam(name = "success", required = false) Boolean success) {

        model.addAttribute("admin", true);
        model.addAttribute("sign_in",true);
        model.addAttribute("sign_up",true);
        model.addAttribute("search_bar", true);
        model.addAttribute("user", true);
        model.addAttribute("allProducts", listService.getProducts());
       if (Boolean.TRUE.equals(success)) {
            model.addAttribute("mensajeExito", "¡Producto borrado correctamente!");
        }

        return "home";
    }
    
}
