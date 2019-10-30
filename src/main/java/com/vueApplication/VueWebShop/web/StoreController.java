package com.vueApplication.VueWebShop.web;

import com.vueApplication.VueWebShop.domain.Store;
import com.vueApplication.VueWebShop.domain.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    private StoreRepository repository;

    @RequestMapping("/api/stores/{slug}")
    public Iterable<Store> getStoreBySlug(@PathVariable String slug) {
        return repository.findAllBySlug(slug);
    }
}
