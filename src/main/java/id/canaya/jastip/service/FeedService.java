/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.service;

import id.canaya.jastip.entity.FeedMessage;
import id.canaya.jastip.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: FeedService.java, v 0.1 2022‐06‐21 14.16 Rionaldy "Roy" Triantoro Exp $$
 */
@Service
public class FeedService {

    @Autowired
    private FeedRepository feedRepository;

    public List<FeedMessage> getNewsFeed() {
        return feedRepository.findAll();
    }
}
