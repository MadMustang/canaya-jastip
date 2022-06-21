/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.repository;

import id.canaya.jastip.entity.ProductDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: ProductRepository.java, v 0.1 2022‐06‐21 11.16 Rionaldy "Roy" Triantoro Exp $$
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductDO, Long> {


}
