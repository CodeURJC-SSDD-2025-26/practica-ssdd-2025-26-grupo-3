package es.codeurjc.postcredits;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EditProductController {
    @GetMapping("/edit_product")
    public String editProduct(Model model){
        return "edit_product";
    }



}
