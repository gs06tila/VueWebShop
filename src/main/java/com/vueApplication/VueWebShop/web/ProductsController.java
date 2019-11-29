package com.vueApplication.VueWebShop.web;

import com.vueApplication.VueWebShop.domain.Product;
import com.vueApplication.VueWebShop.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    @Autowired
    private ProductRepository repository;

    @RequestMapping("/api/products/{slug}")
    public Iterable<Product> getProductsBySlug(@PathVariable String slug) {
        return repository.findAllBySlug(slug);
    }
}
