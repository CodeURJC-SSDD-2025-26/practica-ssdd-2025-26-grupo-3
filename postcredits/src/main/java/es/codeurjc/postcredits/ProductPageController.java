package es.codeurjc.postcredits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class ProductPageController {
   @Autowired ListService listService;
    @GetMapping("/product_page/{id}")
    public String productPage(Model model, @PathVariable long id){
       Product product=listService.foundProductById(id);
       if(product!=null){
        model.addAttribute("type", product);
        if(product instanceof Book){
            model.addAttribute("book",true);
            model.addAttribute("game",false);
        } else if (product instanceof Game) {
            model.addAttribute("book",false);
            model.addAttribute("game",true);
        }
        //model.addAttribute("product",product);
        return "product_page";
       } else {
         return "redirect:/";
       }
    }
    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable long id) {
    // 1. Llamamos al service para borrarlo de la lista maestra
        listService.deleteById(id);
    
    // 2. Tras borrarlo, redirigimos al HOME
    // (Porque la página del producto ya no existe)
        return "redirect:/";
    }
    @GetMapping("/product_page/{id}/delete_review/{idReview}")
    public String deleteReview(@PathVariable("id") long id, @PathVariable("idReview") long idReview) {
        // Assuming you have a method to delete a review by its ID
         listService.deleteReviewById(id, idReview);
        return "redirect:/product_page/" + id;
    }
   
    

}
