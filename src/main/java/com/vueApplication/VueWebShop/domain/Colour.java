package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="colour")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Colour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long colorId;

    @Column(length = 255)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colour")
    @JsonIgnore
    private List<ProductVariant> productVariants;

    public Colour() {
    }

    public Colour(String name) {
        this.name = name;
    }

    public long getColorId() {
        return colorId;
    }

    public void setColorId(long colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductVariant> getProductVariants() {
        return productVariants;
    }

    public void setProductVariants(List<ProductVariant> productVariants) {
        this.productVariants = productVariants;
    }
}
