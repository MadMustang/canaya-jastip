/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.service;

import id.canaya.jastip.entity.ProductDO;
import id.canaya.jastip.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: ProductService.java, v 0.1 2022‐06‐21 12.17 Rionaldy "Roy" Triantoro Exp $$
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDO> getAllProducts() {
        return productRepository.findAll();
    }
}
