/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.service;

import id.canaya.jastip.dto.feed.MessageRes;
import id.canaya.jastip.entity.FeedMessage;
import id.canaya.jastip.entity.User;
import id.canaya.jastip.repository.FeedRepository;
import id.canaya.jastip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: FeedService.java, v 0.1 2022‐06‐21 14.16 Rionaldy "Roy" Triantoro Exp $$
 */
@Service
public class FeedService {

    @Autowired
    private FeedRepository feedRepository;

    @Autowired
    private UserRepository userRepository;

    public List<MessageRes> getNewsFeed() {
        return feedRepository.findAll()
                .stream()
                .map(this::convertToMessageRes)
                .collect(Collectors.toList());
    }

    private MessageRes convertToMessageRes(FeedMessage feedMessage) {
        User user = userRepository.findById(feedMessage.getUserId()).orElse(new User());
        return new MessageRes(feedMessage, user);
    }
}
