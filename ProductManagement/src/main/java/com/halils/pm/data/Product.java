/*
 * Copyright (c) 2021.  halils.com
 * All rights reserved.
 * It's a joke there's nothing you can use lol.
 *
 */

package com.halils.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * {@code Product} class represents properties and behaviour
 * of product objects in the Product Management System
 * <br>
 * Each product has an id, name and price
 * <br>
 * Each product can have discount, calculated based on
 * {@link #DISCOUNT_RATE discount rate}
 * @author halil sari
 * @version 1.0.0
 *  */
public class Product {

    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value
     * of the discount rate
     * <br>
     * Discount rate is 10%
     * <br>
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Calculates discount based on product price and
     * {@link #DISCOUNT_RATE discount rate}
     * @return a {@link java.math.BigDecimal BigDecimal}
     * value of the discount
     */
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }
}
