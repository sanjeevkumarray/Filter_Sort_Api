package com.example.filter_api.service;

import com.example.filtersortapi.model.Product;
import com.example.filtersortapi.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetFilteredAndSortedProducts() {
        // Initialize mock data
        Product product1 = new Product("1", "Smartphone", "electronics", 299.99, true, 4.5, new Date());
        Product product2 = new Product("2", "Laptop", "electronics", 899.99, true, 4.7, new Date());
        List<Product> mockProducts = Arrays.asList(product1, product2);

        when(productRepository.findAll(PageRequest.of(0, Integer.MAX_VALUE, Sort.by(Sort.Order.asc("price")))))
                .thenReturn(mockProducts);

        List<Product> products = productService.getFilteredAndSortedProducts("electronics", 100.0, 1000.0, true, "price", "asc");

        assertEquals(2, products.size());
        assertEquals("Smartphone", products.get(0).getName());
        assertEquals("Laptop", products.get(1).getName());
    }
}
