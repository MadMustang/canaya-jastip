/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.dto.feed;

import id.canaya.jastip.entity.FeedMessage;
import id.canaya.jastip.entity.User;

import java.time.LocalDate;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: MessageRes.java, v 0.1 2022‐06‐22 10.02 Rionaldy "Roy" Triantoro Exp $$
 */
public class MessageResponse {

    private Long id;

    private String userName;

    private String message;

    private LocalDate returnDate;

    private Integer commentCount;

    private String imageUrl;

    public MessageResponse() {}

    public MessageResponse(FeedMessage message, User user) {
        this.id = message.getId();
        this.message = message.getMessage();
        this.returnDate = message.getReturnDate();
        this.commentCount = message.getCommentCount();
        this.userName = user.getName();
        this.imageUrl = user.getImageUrl();
    }

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for property userName.
     *
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property userName.
     *
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property message.
     *
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property message.
     *
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter method for property returnDate.
     *
     * @return property value of returnDate
     */
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * Setter method for property returnDate.
     *
     * @param returnDate value to be assigned to property returnDate
     */
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * Getter method for property commentCount.
     *
     * @return property value of commentCount
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * Setter method for property commentCount.
     *
     * @param commentCount value to be assigned to property commentCount
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * Getter method for property imageUrl.
     *
     * @return property value of imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter method for property imageUrl.
     *
     * @param imageUrl value to be assigned to property imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
