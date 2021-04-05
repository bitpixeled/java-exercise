/*
 * Copyright (c) 2021.  halils.com
 * All rights reserved.
 * It's a joke there's nothing you can use lol.
 *
 */

package com.halils.floatingnumbers;

public class FloatingPointNumbers {
    public static void main(String[] args) {
        /*
            float - 32bit - default value 0.0F - Upper or lowercase "F" at the end
            double - 64bit - default value 0.0
         */
        float numF = 3.123456789132F; // 7 digits after decimal point
        double numD = 1.12345678901223334444; // 17 digits after decimal point

        System.out.println("float can show 7 decimal digits = " + numF);
        System.out.println("double can show 17 decimal digits = " + numD);

        // float can be auto upcast to bigger type double
        float lowFloat = 0.1234567F;
        double bigDouble = lowFloat;

        System.out.println("Auto upcast from float to double = " + bigDouble);

        // both can be assigned normal or with exponential annotation
        // multiple same type variable can be declared and initialized with comma separation
        double expoDouble1 = 1.E3, expoDouble2 = 0.12345E5;

        System.out.println("expo double 1 = " + expoDouble1);
        System.out.println("expo double 2 = " + expoDouble2);

        // numbers can be separated with underscore
        // "._1" + "1_." + "1_" is illegal
        double separatedDouble = 1.111_222_333;
        System.out.println("Separated = " + separatedDouble);

    }
}
