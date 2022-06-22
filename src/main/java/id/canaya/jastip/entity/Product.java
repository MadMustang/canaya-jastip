/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: Product.java, v 0.1 2022‐06‐21 11.04 Rionaldy "Roy" Triantoro Exp $$
 */
@Entity
@Table
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;

    private String productName;

    @Column(columnDefinition = "TEXT")
    private String productDescription;

    private Long price;

    private LocalDate openPreOrderDate;

    private LocalDate sellerReturnDate;

    private Integer quantity;

    private Long sellerId;

    private String country;

    private Integer weight;

    private String productImageUrl;

    public Product() {}

    public Product(String productName, String productDescription, Long price, LocalDate openPreOrderDate, LocalDate sellerReturnDate, Integer quantity, Long sellerId, String country, Integer weight, String productImageUrl) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.openPreOrderDate = openPreOrderDate;
        this.sellerReturnDate = sellerReturnDate;
        this.quantity = quantity;
        this.sellerId = sellerId;
        this.country = country;
        this.weight = weight;
        this.productImageUrl = productImageUrl;
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
     * Getter method for property productName.
     *
     * @return property value of productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Setter method for property productName.
     *
     * @param productName value to be assigned to property productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter method for property productDescription.
     *
     * @return property value of productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Setter method for property productDescription.
     *
     * @param productDescription value to be assigned to property productDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Getter method for property price.
     *
     * @return property value of price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * Setter method for property price.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * Getter method for property openPreOrderLimit.
     *
     * @return property value of openPreOrderLimit
     */
    public LocalDate getOpenPreOrderDate() {
        return openPreOrderDate;
    }

    /**
     * Setter method for property openPreOrderLimit.
     *
     * @param openPreOrderDate value to be assigned to property openPreOrderLimit
     */
    public void setOpenPreOrderDate(LocalDate openPreOrderDate) {
        this.openPreOrderDate = openPreOrderDate;
    }

    /**
     * Getter method for property sellerReturnDate.
     *
     * @return property value of sellerReturnDate
     */
    public LocalDate getSellerReturnDate() {
        return sellerReturnDate;
    }

    /**
     * Setter method for property sellerReturnDate.
     *
     * @param sellerReturnDate value to be assigned to property sellerReturnDate
     */
    public void setSellerReturnDate(LocalDate sellerReturnDate) {
        this.sellerReturnDate = sellerReturnDate;
    }

    /**
     * Getter method for property quantity.
     *
     * @return property value of quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter method for property quantity.
     *
     * @param quantity value to be assigned to property quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter method for property sellerId.
     *
     * @return property value of sellerId
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * Setter method for property sellerId.
     *
     * @param sellerId value to be assigned to property sellerId
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Getter method for property country.
     *
     * @return property value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for property country.
     *
     * @param country value to be assigned to property country
     */
    public void setCountry(String country) {
        this.country = country;
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
     * Getter method for property productImageUrl.
     *
     * @return property value of productImageUrl
     */
    public String getProductImageUrl() {
        return productImageUrl;
    }

    /**
     * Setter method for property productImageUrl.
     *
     * @param productImageUrl value to be assigned to property productImageUrl
     */
    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }
}
