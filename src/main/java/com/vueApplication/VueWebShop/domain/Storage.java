package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="storage")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Storage {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(length = 255)
    private String capacity;

    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "storage")
    // @JsonIgnore
    // private List<ProductVariants> productVariants;

    public Storage() {
    }

    public Storage(String capacity) {
        this.capacity = capacity;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
