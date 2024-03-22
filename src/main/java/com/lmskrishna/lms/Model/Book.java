package com.lmskrishna.lms.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
    private int authno;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "isbn")
    private Long isbn;
    @Column(name="title")
    private String title;
    @Column(name = "edition")
    private String edition;
    @Column(name = "category")
    private String category;
    @Column(name = "price")
    private double price;
    public Book() {
    }
    public Book(int authno, Long isbn, String title, String edition, String category, double price) {
        this.authno = authno;
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
        this.category = category;
        this.price = price;
    }
    
    public int getAuthno() {
        return authno;
    }
    public void setAuthno(int authno) {
        this.authno = authno;
    }
    public Long getIsbn() {
        return isbn;
    }
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getEdition() {
        return edition;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book [authno=" + authno + ", isbn=" + isbn + ", title=" + title + ", edition=" + edition + ", category="
                + category + ", price=" + price + "]";
    }
    
}
