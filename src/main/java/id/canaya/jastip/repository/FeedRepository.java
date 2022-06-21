/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.repository;

import id.canaya.jastip.entity.FeedMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: FeedRepository.java, v 0.1 2022‐06‐21 14.17 Rionaldy "Roy" Triantoro Exp $$
 */
@Repository
public interface FeedRepository extends JpaRepository<FeedMessage, Long> {


}
