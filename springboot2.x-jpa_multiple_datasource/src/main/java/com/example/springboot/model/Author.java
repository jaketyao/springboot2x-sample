package com.example.springboot.model;

import javax.persistence.*;

/**
 * @author Yao.Jie
 * @description ${DESCRIPTION}
 * @create 2018-04-11 18:01
 **/
@Entity
@Table( name =  "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public  String  names;

    public  int ages;

    public String email;

    public Long getId() {
        return id;
    }

    public Author setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNames() {
        return names;
    }

    public Author setNames(String names) {
        this.names = names;
        return this;
    }

    public int getAges() {
        return ages;
    }

    public Author setAges(int ages) {
        this.ages = ages;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Author setEmail(String email) {
        this.email = email;
        return this;
    }
}
