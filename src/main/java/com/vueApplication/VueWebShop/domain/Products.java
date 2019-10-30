package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Products {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(length = 255)
    private String name;

    @Column(length = 255, unique = true)
    private String slug;

    @Column(length = 255)
    private String thumbnail;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(precision = 10, scale = 2)
    private Double price;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
     @JsonIgnore
     private List<ProductVariants> productVariants;

    public Products() {
        super();
    }

    public Products(String name, String slug, String thumbnail, String shortDescription, String description, Double price) {
        super();
        this.name = name;
        this.slug = slug;
        this.thumbnail = thumbnail;
        this.shortDescription = shortDescription;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<ProductVariants> getProductVariants() {
        return productVariants;
    }

    public void setProductVariants(List<ProductVariants> productVariants) {
        this.productVariants = productVariants;
    }
}
