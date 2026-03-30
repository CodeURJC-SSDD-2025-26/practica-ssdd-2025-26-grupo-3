package es.codeurjc.postcredits;
import java.util.*;
public class Book extends Product {
    private String author;
    private String saga;
    public Book(long id, String name, Date date, String author, String genre, String saga, String editorial, String synopsis, String imageURL) {
        super(id, name, date, genre, editorial, synopsis, imageURL);
        this.author = author;
        this.saga = saga;
    }
    public String getAuthor() {
        return author;
    }
    public String getSaga() {
        return saga;
    }
    
    public String setAuthor(String author) {
        this.author = author;
        return author;
    }
    public String setSaga(String saga) {
        this.saga = saga;
        return saga;
    }



}
