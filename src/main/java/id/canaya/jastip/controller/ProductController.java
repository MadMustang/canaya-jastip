/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.controller;

import id.canaya.jastip.constants.RequestMappingConstants;
import id.canaya.jastip.entity.Product;
import id.canaya.jastip.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: ProductController.java, v 0.1 2022‐06‐21 10.57 Rionaldy "Roy" Triantoro Exp $$
 */
@RestController
@RequestMapping(path = RequestMappingConstants.PRODUCT_CONTROLLER)
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getRandomProducts() {
        return productService.getRandomProducts();
    }

    @GetMapping(path = "newest")
    public List<Product> getNewestProduct(@RequestParam(value = "itemListSize", defaultValue = "10") Integer itemListSize) {
        return productService.getNewestProducts(itemListSize);
    }

    @GetMapping(path = "product")
    public Product getProductById(@RequestParam("productId") Long productId) {
        return productService.getProductByProductId(productId);
    }
}
