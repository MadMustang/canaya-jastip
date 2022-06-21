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
public class ProductDO {

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

    private String productDescription;

    private Double price;

    private LocalDate openPreOrderLimit;

    private LocalDate sellerReturnDate;

    private String productImageUrl;

    public ProductDO() {}

    public ProductDO(String productName, String productDescription, Double price, LocalDate openPreOrderLimit, LocalDate sellerReturnDate) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.openPreOrderLimit = openPreOrderLimit;
        this.sellerReturnDate = sellerReturnDate;
    }

    public ProductDO(String productName, String productDescription, Double price, LocalDate openPreOrderLimit, LocalDate sellerReturnDate, String productImageUrl) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.openPreOrderLimit = openPreOrderLimit;
        this.sellerReturnDate = sellerReturnDate;
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
    public Double getPrice() {
        return price;
    }

    /**
     * Setter method for property price.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Getter method for property openPreOrderLimit.
     *
     * @return property value of openPreOrderLimit
     */
    public LocalDate getOpenPreOrderLimit() {
        return openPreOrderLimit;
    }

    /**
     * Setter method for property openPreOrderLimit.
     *
     * @param openPreOrderLimit value to be assigned to property openPreOrderLimit
     */
    public void setOpenPreOrderLimit(LocalDate openPreOrderLimit) {
        this.openPreOrderLimit = openPreOrderLimit;
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
