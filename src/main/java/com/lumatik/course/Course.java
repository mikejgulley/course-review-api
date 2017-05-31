package com.lumatik.course;

import com.lumatik.com.lumatik.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mgull on 5/31/2017.
 */
@Entity
public class Course extends BaseEntity {
    private String title;
    private String url;

    protected Course() {
        super();
    }

    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
