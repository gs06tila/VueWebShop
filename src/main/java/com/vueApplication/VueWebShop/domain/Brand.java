package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="brand")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long brandId;

    @Column(length = 255)
    private String name;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "brand")
    @JsonIgnore
    private List<Product> products;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
