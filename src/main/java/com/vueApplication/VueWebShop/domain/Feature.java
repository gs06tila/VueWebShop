package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="feature")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "features")
    @JsonIgnore
    private Set<Product> products = new HashSet<>();

    public Feature() {
    }

    public Feature(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long featureId) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
