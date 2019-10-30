package com.vueApplication.VueWebShop.domain;

import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Long> {
    Iterable<Store> findAllBySlug(String slug);
}
