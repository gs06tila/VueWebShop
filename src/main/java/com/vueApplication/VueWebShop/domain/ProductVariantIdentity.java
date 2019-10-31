package com.vueApplication.VueWebShop.domain;

import com.sun.istack.NotNull;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductVariantIdentity implements Serializable {

    @NotNull
    private Long productId;

    @NotNull
    private Long storageId;

    @NotNull
    private Long colourId;

    public ProductVariantIdentity() {
    }

    public ProductVariantIdentity(Long productId, Long storageId, Long colourId) {
        this.productId = productId;
        this.storageId = storageId;
        this.colourId = colourId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStorageId() {
        return storageId;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public Long getColourId() {
        return colourId;
    }

    public void setColourId(Long colourId) {
        this.colourId = colourId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductVariantIdentity that = (ProductVariantIdentity) o;

        if (!productId.equals(that.productId)) return false;
        return storageId.equals(that.storageId);
    }

    @Override
    public int hashCode() {
        int result = productId.hashCode();
        result = 31 * result + storageId.hashCode();
        return result;
    }
}
