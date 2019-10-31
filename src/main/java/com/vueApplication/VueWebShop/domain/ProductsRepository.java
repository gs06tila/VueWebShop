package com.vueApplication.VueWebShop.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductsRepository extends CrudRepository <Products, Long> {

    Iterable<Products> findAllBySlug(String slug);
}
