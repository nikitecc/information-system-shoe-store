package com.informationsystemshoestore.shoestoredataservice.repository;

import com.informationsystemshoestore.shoestoredataservice.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {

}