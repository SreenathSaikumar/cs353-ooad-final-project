package com.cs353.ooadproj;

import java.util.List;
//import java.util.Objects;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

    @Id
    private String id;
    private String title;
    private double price;
    private String description;
    private String[] images;
    private String[] tags;
    private List<Review> reviews;

    public Product(String title, double price, String description, String[] images, String[] tags) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.images = images;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Long userId, String reviewBody, int rating) {
        Review review = new Review(userId, reviewBody, rating);
        reviews.add(review);
    }

    public void deleteReview(Review review) {
        reviews.remove(review);
    }

}
