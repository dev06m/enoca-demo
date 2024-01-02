package com.example.demo.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @OneToMany(mappedBy = "customer")
    private List<Ordeer> ordeer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Ordeer> getOrders() {
        return ordeer;
    }

    public void setOrders(List<Ordeer> orders) {
        this.ordeer = ordeer;
    }

    public Customer(Long id, String name, int age, List<Ordeer> orders) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ordeer = ordeer;
    }

    public Customer() {
    }
}