package com.lumatik.review;

import com.lumatik.core.BaseEntity;
import com.lumatik.course.Course;
import com.lumatik.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Created by mgull on 5/31/2017.
 */
@Entity
public class Review extends BaseEntity {
    private int rating;
    private String description;
    @ManyToOne()
    private Course course;
    @ManyToOne
    private User reviewer;

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    protected Review() {
        super();
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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
