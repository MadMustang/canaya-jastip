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

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: User.java, v 0.1 2022‐06‐21 14.51 Rionaldy "Roy" Triantoro Exp $$
 */
@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;

    private String name;

    private String location;

    private String rating;

    private String lastOnline;

    private Long balance;

    private String imageUrl;

    public User() {}

    public User(String name, Long balance) {
        this.name = name;
        this.balance = balance;
    }

    public User(String name, String location, String rating, String lastOnline, Long balance, String imageUrl) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.lastOnline = lastOnline;
        this.balance = balance;
        this.imageUrl = imageUrl;
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
     * Getter method for property name.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property name.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property location.
     *
     * @return property value of location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter method for property location.
     *
     * @param location value to be assigned to property location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter method for property rating.
     *
     * @return property value of rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * Setter method for property rating.
     *
     * @param rating value to be assigned to property rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Getter method for property lastOnline.
     *
     * @return property value of lastOnline
     */
    public String getLastOnline() {
        return lastOnline;
    }

    /**
     * Setter method for property lastOnline.
     *
     * @param lastOnline value to be assigned to property lastOnline
     */
    public void setLastOnline(String lastOnline) {
        this.lastOnline = lastOnline;
    }

    /**
     * Getter method for property balance.
     *
     * @return property value of balance
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * Setter method for property balance.
     *
     * @param balance value to be assigned to property balance
     */
    public void setBalance(Long balance) {
        this.balance = balance;
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
