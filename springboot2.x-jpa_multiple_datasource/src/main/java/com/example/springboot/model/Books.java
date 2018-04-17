package com.example.springboot.model;

import javax.persistence.*;

/**
 * @author Yao.Jie
 * @description ${DESCRIPTION}
 * @create 2018-04-11 11:13
 **/
@Entity
@Table(name= "books" )
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public  Long id;

    public  String  bookName;

    public  String category;

    public  String author;

    public  String titer;

    public  Double price = 0.00;

    public Long getId() {
        return id;
    }

    public Books setId(Long id) {
        this.id = id;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public Books setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Books setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Books setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTiter() {
        return titer;
    }

    public Books setTiter(String titer) {
        this.titer = titer;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Books setPrice(Double price) {
        this.price = price;
        return this;
    }
}
