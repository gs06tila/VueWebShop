package com.vueApplication.VueWebShop.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FeatureRepository extends CrudRepository<Feature, Long> {
}
