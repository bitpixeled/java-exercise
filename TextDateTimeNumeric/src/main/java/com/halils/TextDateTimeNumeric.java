package com.halils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class TextDateTimeNumeric {
    public static void main(String[] args) {
        /*
        String is immutable.
        Whenever you modify String JVM allocates memory and creates new String
        use StringBuilder if you want to manipulate String, because StringBuilder is mutable.
        */

        String tea = "Tea";
        String otherTea = "Tea";
        if (tea == otherTea){
            System.out.println("Result is true because they are the same word in the String pool");
        }

        /*
         Correct way to test if these values are the same
         is using String class method .equals(Object o)
         */
        String newTea = new String("Tea");
        if (tea == newTea){
            System.out.println("It's true");
        } else {
            System.out.println("It's false because it's not interned to same pool 'new' keyword is used to create String");
        }

        StringBuilder teaBuilder = new StringBuilder();
        teaBuilder.append("Tea");
        teaBuilder.append("s");
        int capacity = teaBuilder.capacity();

        System.out.println("StringBuilder = " + teaBuilder);
        System.out.println("StringBuilder's Capacity is = " + capacity +" and it will expand when needed");

        teaBuilder.append(" This part is added");
        int newCapacity = teaBuilder.capacity();

        System.out.println(teaBuilder + " and the Capacity (" + newCapacity + ") is automatically increased");


        // BigInteger, BigDecimal classes and their methods can be used for advanced operations
        BigDecimal price = BigDecimal.valueOf(1.85);
        BigDecimal rate = BigDecimal.valueOf(0.065);

        price = price.subtract(price.multiply(rate)).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Price calculated with BigDecimal class = " + price);

        // Text representations of the numbers in different format
        Locale locale = Locale.FRANCE;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);

        String formatTxt = currencyFormat.format(price);
        String percentTxt = percentFormat.format(rate);

        System.out.println("Currency as French = " + formatTxt + " Percentage as French = " + percentTxt);


    }
}
