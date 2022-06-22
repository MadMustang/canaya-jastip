/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.dto;

import id.canaya.jastip.entity.Product;
import id.canaya.jastip.entity.User;

import java.time.LocalDate;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: ProductRes.java, v 0.1 2022‐06‐22 09.28 Rionaldy "Roy" Triantoro Exp $$
 */
public class ProductResponse {

    private Long id;

    private String productName;

    private String productDescription;

    private Long price;

    private LocalDate openPreOrderDate;

    private LocalDate sellerReturnDate;

    private Integer quantity;

    private User seller;

    private String country;

    private String productImageUrl;

    public ProductResponse() {}

    public ProductResponse(Product product, User seller) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.productDescription = product.getProductDescription();
        this.price = product.getPrice();
        this.openPreOrderDate = product.getOpenPreOrderDate();
        this.sellerReturnDate = product.getSellerReturnDate();
        this.quantity = product.getQuantity();
        this.seller = seller;
        this.country = product.getCountry();
        this.productImageUrl = product.getProductImageUrl();
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
     * Getter method for property openPreOrderDate.
     *
     * @return property value of openPreOrderDate
     */
    public LocalDate getOpenPreOrderDate() {
        return openPreOrderDate;
    }

    /**
     * Setter method for property openPreOrderDate.
     *
     * @param openPreOrderDate value to be assigned to property openPreOrderDate
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
     * Getter method for property seller.
     *
     * @return property value of seller
     */
    public User getSeller() {
        return seller;
    }

    /**
     * Setter method for property seller.
     *
     * @param seller value to be assigned to property seller
     */
    public void setSeller(User seller) {
        this.seller = seller;
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
