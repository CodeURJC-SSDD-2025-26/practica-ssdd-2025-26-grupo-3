package es.codeurjc.postcredits.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

import es.codeurjc.postcredits.model.Book;
import es.codeurjc.postcredits.model.Game;
import es.codeurjc.postcredits.model.Product;

@Service
public class ListService {
    // CLAVE: El "new ArrayList<>(...)" hace que la lista sea MODIFICABLE
    private List<Product> products = new ArrayList<>(Arrays.asList(
        new Book(1, "El señor de la humanidad", new GregorianCalendar(2017, 0, 1).getTime(), "Guy Haley", "Ciencia Ficción", "The Horus Heresy", "Black Library", "La guerra llega a Terra...", "El_señor_de_la_humanidad.jpg"),
        new Book(2, "Nacidos de la bruma", new GregorianCalendar(2006, 0, 1).getTime(), "Brandon Sanderson", "Fantasía", "Mistborn", "Nova", "En un mundo donde llueve ceniza...", "Nacidos_de_la_Bruma_El_imperio_final.png"),
        new Game(3, "Silksong", new GregorianCalendar(2024, 0, 1).getTime(), "Team Cherry", "Metroidvania", "Hollow Knight", "Indie", "La aventura de Hornet...", "silksong.png"),
        new Game(4, "Skyrim", new GregorianCalendar(2011, 0, 1).getTime(), "Bethesda", "RPG", "The Elder Scrolls", "Bethesda", "El retorno de los dragones...", "Skyrim.png")
    ));

    public List<Product> getProducts() {
        return products;
    }
    public Product foundProductById(long id){
        for(Product book : this.products){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }
     public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        for (Product p : this.getProducts()) {
            if (p instanceof Book) {
                books.add((Book) p);
            }
        }
        return books;
    }
    public List<Game> getGames() {
        List<Game> games = new ArrayList<>();
        for (Product p : this.getProducts()) {
            if (p instanceof Game) {
                games.add((Game) p);
            }
        }
        return games;
    }
    
    public void deleteById(long id) {
        // Esta operación fallará si la lista no es un ArrayList real
        this.products.removeIf(book -> book.getId() == id);
    }
   public void deleteReviewById(long idBook, long idReview) {
        Product product = foundProductById(idBook);
        if (product != null) {
            product.getReviews().removeIf(review -> review.getIdReview() == idReview);
        }
    }
}
