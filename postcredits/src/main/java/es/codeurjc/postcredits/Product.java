package es.codeurjc.postcredits;
import java.text.SimpleDateFormat;
import java.util.*;
public class Product {
    public long id;
    private String name;
    private Date date;
    //private String author;
    private String genre;
    //private String saga;
    private String editorial;
    private String synopsis;
    private String imageURL;
    private List<Review> reviews;
    public Product(long id, String name, Date date, String genre, String editorial, String synopsis, String imageURL) {
        this.id = id;
        this.name = name;
        this.date = date;
        
        this.genre = genre;
        
        this.editorial = editorial;
        this.synopsis = synopsis;
        this.imageURL = imageURL;
        this.reviews = new ArrayList<>();
        this.reviews.add(new Review(1,"Harold Bloom", "It is a work of overflowing imagination...", 3.5));
        this.reviews.add(new Review(2,"Harold Bloom", "It is a crystal cathedral built over a nightmare abyss...", 4.0));
        this.reviews.add(new Review(3,"Arturo Pérez-Reverte", "Es una crónica de una resistencia inútil y soberbia...", 3.5));
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getDate() {
        return date;
    }
   
    public String getGenre() {
        return genre;
    }
    
    public String getEditorial() {
        return editorial;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public String getImageURL() {
        return imageURL;
    }
    public List<Review> getReviews() {
        for(Review review : this.reviews){
            review.toString();
        }
        return reviews;

    }
    public int getYearFromDate() {
        if (this.date == null) return 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.YEAR);
    }
    public String getHtmlDate() {
    if (this.date == null) return "";
    // Esto transforma la fecha de Java al único formato que entiende el HTML
    return new SimpleDateFormat("yyyy-MM-dd").format(this.date);
}
    public long setId(long id) {
        this.id = id;
        return id;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public Date setDate(Date date) {
        this.date = date;
        return date;
    }
    
    public String setGenre(String genre) {
        this.genre = genre;
        return genre;
    }
    
    public String setEditorial(String editorial) {
        this.editorial = editorial;
        return editorial;
    }
    public String setSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return synopsis;
    }
    public String setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return imageURL;
    }
    public List<Review> setReviews(List<Review> reviews) {
        this.reviews = reviews;
        return reviews;
    }



}

