package com.vueApplication.VueWebShop.web;

import com.vueApplication.VueWebShop.domain.Products;
import com.vueApplication.VueWebShop.domain.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    @Autowired
    private ProductsRepository repository;

    @RequestMapping("/api/products/{slug}")
    public Iterable<Products> getProductsBySlug(@PathVariable String slug) {
        return repository.findAllBySlug(slug);
    }
}
