package com.blogBoys.blogBoys.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer user_id;
    String name;
    String password;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @LazyCollection(LazyCollectionOption.TRUE)
//    @JsonManagedReference
//    private List<Posts> posts = new ArrayList<>();


    public Users() {
    }

    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    public List<Posts> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(List<Posts> posts) {
//        this.posts = posts;
//    }

}