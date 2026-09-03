package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;
    private String email;

    //Getters na Setters
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    


    public String getName(){return name; }
    public Void setName(String name){this.name = name;
        return null; }


    public String getEmail(){return email; }
    public Void setEmail(String email){this.email = email;
        return null; }
}
