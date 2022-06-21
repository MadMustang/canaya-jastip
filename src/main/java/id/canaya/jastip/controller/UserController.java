/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.controller;

import id.canaya.jastip.constants.RequestMappingConstants;
import id.canaya.jastip.entity.User;
import id.canaya.jastip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: UserController.java, v 0.1 2022‐06‐21 15.07 Rionaldy "Roy" Triantoro Exp $$
 */
@RestController
@RequestMapping(value = RequestMappingConstants.USER_CONTROLLER)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("profile")
    public User getUserProfile(@RequestParam("userId") Long userId) {
        return userService.getUserProfile(userId);
    }
}
