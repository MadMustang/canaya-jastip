/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.service;

import id.canaya.jastip.dto.ProductResponse;
import id.canaya.jastip.entity.Product;
import id.canaya.jastip.entity.User;
import id.canaya.jastip.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

    @Autowired
    private UserService userService;

    public List<Product> getRandomProducts() {
        return productRepository.findAll()
                .stream()
                .limit(10)
                .collect(Collectors.toList());
    }

    public ProductResponse getProductByProductId(Long productId) {
        return productRepository.findById(productId)
                .map(this::convertToProductResponse)
                .orElse(null);
    }

    public List<ProductResponse> getNewestProducts(int itemListSize) {
        List<Product> productList = productRepository.findAll();
        if (itemListSize > productList.size()) {
            List<ProductResponse> productResponseList = productList
                    .stream()
                    .map(this::convertToProductResponse)
                    .collect(Collectors.toList());
            Collections.reverse(productResponseList);
            return productResponseList;
        }

        List<ProductResponse> productResponseList = productList
                .stream()
                .filter(product -> product.getId() > productList.size() - itemListSize)
                .limit(itemListSize)
                .map(this::convertToProductResponse)
                .collect(Collectors.toList());

        Collections.reverse(productResponseList);
        return productResponseList;
    }

    public List<ProductResponse> getMostPopularProducts(int itemListSize) {
        List<Product> productList = productRepository.findAll();
        if (itemListSize > productList.size()) {
            List<ProductResponse> productResponseList = productList
                    .stream()
                    .map(this::convertToProductResponse)
                    .collect(Collectors.toList());
            Collections.shuffle(productResponseList);
            return productResponseList;
        }

        List<ProductResponse> productResponseList = productList
                .stream()
                .filter(product -> product.getId() <= itemListSize)
                .limit(itemListSize)
                .map(this::convertToProductResponse)
                .collect(Collectors.toList());

        Collections.shuffle(productResponseList);

        return productResponseList;
    }

    public List<ProductResponse> getProductsByCountry(String country) {
        return productRepository.findProductsByCountry(country)
                .stream()
                .map(this::convertToProductResponse)
                .collect(Collectors.toList());
    }

    public List<ProductResponse> getProductsByProductName(String productName) {
        return productRepository.findByProductNameContains(productName)
                .stream()
                .map(this::convertToProductResponse)
                .collect(Collectors.toList());
    }

    private ProductResponse convertToProductResponse(Product product) {
        User seller = userService.getUserProfile(product.getSellerId());
        return new ProductResponse(product, seller);
    }
}
