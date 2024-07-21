package com.example.filter_api.repository;

import com.example.filtersortapi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
