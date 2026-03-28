package es.codeurjc.postcredits;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ProductPageController {
    @GetMapping("/product_page")
    public String productPage(Model model) {
        return "product_page";
    }
    


}
