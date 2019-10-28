package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(length=128, nullable = false, updatable = false)
    private String firstName;

    @Column(length=128, nullable = false, updatable = false)
    private String lastName;

    public AppUser(String firstName, String lastName) {
        userId = 0;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
