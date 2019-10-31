package com.vueApplication.VueWebShop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="store")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(length = 255)
    private String slug;

    @Column(length = 255)
    private String name;

    @Column(length = 255)
    private String city;

    @Column(length = 255)
    private String country;

    @Column(length = 100)
    private String zip;

    @Column(length = 255)
    private String adress;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column()
    private Double longitude;

    @Column()
    private Double lat;

    public Store() {
    }

    public Store(String slug, String name, String city, String country, String zip, String adress, String description, Double longitude, Double lat) {
        super();
        Id = 0;
        this.slug = slug;
        this.name = name;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.adress = adress;
        this.description = description;
        this.longitude = longitude;
        this.lat = lat;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
