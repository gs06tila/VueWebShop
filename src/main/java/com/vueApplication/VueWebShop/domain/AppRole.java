package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "AspNetRoles")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;

    @Column(length=128, nullable = false, updatable = false)
    private String name;

    public AppRole(String name) {
        roleId = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
