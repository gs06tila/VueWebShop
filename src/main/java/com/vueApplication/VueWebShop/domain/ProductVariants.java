package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="productVariants")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductVariants {

    @EmbeddedId
    private ProductVariantIdentity productVariantIdentity;

    @NotNull
    @Column(precision = 10, scale = 2)
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Products products;

    public ProductVariants() {
    }

    public ProductVariants(ProductVariantIdentity productVariantIdentity, Double price) {
        this.productVariantIdentity = productVariantIdentity;
        this.price = price;
    }

    public ProductVariantIdentity getProductVariantIdentity() {
        return productVariantIdentity;
    }

    public void setProductVariantIdentity(ProductVariantIdentity productVariantIdentity) {
        this.productVariantIdentity = productVariantIdentity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
