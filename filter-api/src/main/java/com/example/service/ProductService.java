package com.example.filter_api.service;

import com.example.filtersortapi.model.Product;
import com.example.filtersortapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getFilteredAndSortedProducts(String category, Double minPrice, Double maxPrice, Boolean inStock, String sortField, String sortOrder) {
        Sort sort = Sort.by(Sort.Order.by(sortField != null ? sortField : "createdAt"));
        sort = "desc".equalsIgnoreCase(sortOrder) ? sort.descending() : sort.ascending();

        // Filtering logic
        List<Product> products = productRepository.findAll(PageRequest.of(0, Integer.MAX_VALUE, sort)).getContent();

        // Apply filtering manually
        return products.stream()
                .filter(p -> (category == null || p.getCategory().equals(category)) &&
                        (minPrice == null || p.getPrice() >= minPrice) &&
                        (maxPrice == null || p.getPrice() <= maxPrice) &&
                        (inStock == null || p.isInStock() == inStock))
                .toList();
    }
}
