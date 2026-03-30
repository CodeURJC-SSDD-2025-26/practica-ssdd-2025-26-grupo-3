package es.codeurjc.postcredits;

public class Review {
    private long idReview;
    private String name;
    private String comment;
    private double rating;

    public Review(long idReview, String name, String comment, double rating) {
        this.idReview = idReview;
        this.name = name;
        this.comment = comment;
        this.rating = rating;
    }
    public long getIdReview() {
        return idReview;
    }
    public String getName() {
        return name;
    }
    public String getComment() {
        return comment;
    }
    public double getRating() {
        return rating;
    }
    public void setIdReview(long idReview) {
        this.idReview = idReview;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String toString() {
        return "Review{" +
                "idReview=" + idReview +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
