/*
 * Copyright (c) 2021.  halils.com
 * All rights reserved.
 * It's a joke there's nothing you can use lol.
 *
 */

package com.halils.pm;

import com.halils.pm.data.Product;
import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manages Products
 * @author halil sari
 * @version 1.0.0
 */
public class Shop {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount());

    }
}
