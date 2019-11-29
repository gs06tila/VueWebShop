package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="os")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OS {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long osId;

    @Column(length = 255)
    private String name;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "os")
    @JsonIgnore
    private List<Product> products;

    public OS() {
    }

    public OS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOsId() {
        return osId;
    }

    public void setOsId(Long osId) {
        this.osId = osId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
