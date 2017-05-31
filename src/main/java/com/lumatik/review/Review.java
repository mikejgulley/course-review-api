package com.lumatik.review;

import com.lumatik.com.lumatik.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mgull on 5/31/2017.
 */
@Entity
public class Review extends BaseEntity {

    private int rating;
    private String description;

    protected Review() {
        super();
    }

    public Review(int rating, String description) {
        this();
        this.rating = rating;
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
