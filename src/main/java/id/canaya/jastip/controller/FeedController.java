/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.controller;

import id.canaya.jastip.constants.RequestMappingConstants;
import id.canaya.jastip.entity.FeedMessage;
import id.canaya.jastip.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: FeedController.java, v 0.1 2022‐06‐21 14.08 Rionaldy "Roy" Triantoro Exp $$
 */
@RestController
@RequestMapping(path = RequestMappingConstants.FEED_CONTROLLER)
public class FeedController {

    @Autowired
    private FeedService feedService;

    @GetMapping
    public List<FeedMessage> getNewsFeed() {
        return feedService.getNewsFeed();
    }
}
