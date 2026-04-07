package es.codeurjc.postcredits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import es.codeurjc.postcredits.model.Book;
import es.codeurjc.postcredits.model.Game;
import es.codeurjc.postcredits.model.Product;
import es.codeurjc.postcredits.service.ListService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;



@Controller
public class EditProductController {
     @Autowired
    private ListService listService;
    @GetMapping("/edit_product/{id}")
    public String editProduct(@PathVariable long id, Model model)    {
          Product foundProduct = null;
        for(Product p : this.listService.getProducts()){
            if(p.getId() == id){
                foundProduct = p;
                model.addAttribute("type", foundProduct);
                if(foundProduct instanceof Book){
                model.addAttribute("book",true);
                model.addAttribute("game",false);
                } else if (foundProduct instanceof Game) {
                model.addAttribute("book",false);
                model.addAttribute("game",true);
                }
                break;
            }
        }
       

        return "edit_product";
    }
    @PostMapping("/edit_product/update/{id}")
public String updateProduct(@PathVariable long id, 
                        @RequestParam(value = "imagen", required = false) MultipartFile imageURL,
                         @RequestParam String name, 
                         @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
                         @RequestParam(required=false) String company,
                        @RequestParam(required=false) String author,
                         @RequestParam String synopsis,
                         @RequestParam String genre,
                         @RequestParam(required=false) String saga,
                         @RequestParam(required=false) String franchise
                         ) {
    
    Product p = listService.foundProductById(id);
    
    p.setName(name);
    p.setSynopsis(synopsis);
    p.setDate(date);
    p.setGenre(genre);
    if (!imageURL.isEmpty() && imageURL != null) {          
            try {
                String nombreImagen = imageURL.getOriginalFilename();
                // Ruta donde se guardan las imágenes (ajusta según tu carpeta)
                String userDir = System.getProperty("user.dir");
                Path ruta = Paths.get(userDir, "images", nombreImagen);
                Files.createDirectories(ruta.getParent());
                Files.write(ruta, imageURL.getBytes());
                
                // Actualizamos el nombre en el objeto Book
                p.setImageURL(nombreImagen);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    if(p instanceof Book){
        Book b = (Book) p;
        b.setAuthor(author);
        b.setSaga(saga);
    } else if (p instanceof Game) {
        Game g = (Game) p;
        g.setCompany(company);
        g.setFranchise(franchise);
    }

    // Al terminar, redirigimos a la página del producto para ver los cambios
    return "redirect:/product_page/" + id + "?success=true";
}
}
