package es.codeurjc.postcredits;
import java.util.*;

public class Game extends Product {
    private String company;
    private String franchise;
    public Game(long id, String name, Date date,String company, String genre,String franchise, String editorial, String synopsis, String imageURL){
        super(id, name, date, genre, editorial, synopsis, imageURL);
        this.company = company;
        this.franchise = franchise;
    }
    public String getCompany() {
        return company;
    }
    public String getFranchise() {
        return franchise;
    }
    public String setCompany(String company) {
        this.company = company;
        return company;
    }
    public String setFranchise(String franchise) {
        this.franchise = franchise;
        return franchise;
    }

}
