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

    private Long userId;

    private String message;

    private LocalDate returnDate;

    public FeedMessage() {}

    public FeedMessage(Long userId, String message, LocalDate returnDate) {
        this.userId = userId;
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
     * Getter method for property userId.
     *
     * @return property value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property userId.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}
