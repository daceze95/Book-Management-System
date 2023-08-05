package com.daceze.BMS.model;


public class Book {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getReview() {
        return review;
    }

    public void setReview(Long review) {
        this.review = review;
    }

    private String title;
    private String author;
    private String publishDate;
    private String description;
    private Long review;

    public Book(String id, String title, String author, String publishDate, String description, Long review) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.description = description;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
