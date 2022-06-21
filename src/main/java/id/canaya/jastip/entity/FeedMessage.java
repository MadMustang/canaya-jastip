/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: FeedMessage.java, v 0.1 2022‐06‐21 14.09 Rionaldy "Roy" Triantoro Exp $$
 */
@Entity
@Table
public class FeedMessage {

    @Id
    @SequenceGenerator(
            name = "feed_message_sequence",
            sequenceName = "feed_message_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "feed_message_sequence"
    )
    private Long id;

    private String userName;

    private String message;

    private LocalDate returnDate;

    private String imageUrl;

    public FeedMessage() {}

    public FeedMessage(String userName, String message, LocalDate returnDate) {
        this.userName = userName;
        this.message = message;
        this.returnDate = returnDate;
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
