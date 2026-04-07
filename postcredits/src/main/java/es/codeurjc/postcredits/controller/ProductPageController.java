package es.codeurjc.postcredits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import es.codeurjc.postcredits.model.Book;
import es.codeurjc.postcredits.model.Game;
import es.codeurjc.postcredits.model.Product;
import es.codeurjc.postcredits.service.ListService;




@Controller
public class ProductPageController {
   @Autowired ListService listService;
    @GetMapping("/product_page/{id}")
    public String productPage(Model model, @PathVariable long id,@RequestParam(name = "success", required = false) Boolean success,@RequestParam(name = "delete", required = false) Boolean delete) {
         
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
        if (Boolean.TRUE.equals(success)) {
            model.addAttribute("mensajeExito", "¡Producto actualizado correctamente!");
        }
        if (Boolean.TRUE.equals(delete)) {
            model.addAttribute("mensajeExito", "¡Reseña borrada correctamente!");
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
        return "redirect:/"+"?success=true";
    }
    @GetMapping("/product_page/{id}/delete_review/{idReview}")
    public String deleteReview(@PathVariable("id") long id, @PathVariable("idReview") long idReview) {
        // Assuming you have a method to delete a review by its ID
         listService.deleteReviewById(id, idReview);
        return "redirect:/product_page/" + id + "?delete=true";
    }
   
    

}
