/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.service;

import id.canaya.jastip.entity.Product;
import id.canaya.jastip.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: ProductService.java, v 0.1 2022‐06‐21 12.17 Rionaldy "Roy" Triantoro Exp $$
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getRandomProducts() {
        return productRepository.findAll()
                .stream()
                .limit(10)
                .collect(Collectors.toList());
    }

    public Product getProductByProductId(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public List<Product> getNewestProducts(int itemListSize) {
        return productRepository.findAll()
                .stream()
                .limit(itemListSize)
                .collect(Collectors.toList());
    }

    public List<Product> getNewestProducts() {
        return productRepository.findAll();
    }
}
