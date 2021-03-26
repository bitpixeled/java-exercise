package com.halils;

public class WholeNumbers {
    public static void main(String[] args) {
        /*
        whole numbers can be stored in this four primitive data types.
        values can be given as decimal, octal, binary or hexadecimal
        */
        byte binaryByte = 0b110111; // Binary representation (base 2) must start with "0b" (zero and b)
        short octalShort = 012542; // Octal representation (base 8) must start with "0" (zero)
        int hexInt = 0xfff02a; // Hex representation (base 16) must start with "0x" (zero and x)
        /*
        Decimal representation (base 10) means the number system we all used to
        Upper or lowercase "L" at the end indicates long value
         */
        long decimalLong = 22553213213214L;

        System.out.println("This is byte = " + binaryByte + " (Binary value represented as decimal)");
        System.out.println("This is short = " + octalShort + " (Binary value represented as decimal)");
        System.out.println("This is int = " + hexInt + " (Binary value represented as decimal)");
        System.out.println("This is long = "+ decimalLong + " (Value haven't changed)");


        /*
        underscore separation in between the numbers is legal "1_2".
        _123 or 123_ is illegal
         */
        int separatedInt = 111_123;

        System.out.println("Separated numbers = " + separatedInt);

        /*
         Smaller types are automatically promoted to bigger types
         */
        byte smallType = 54;
        int upCastingSmallType = smallType;

        System.out.println("Byte turned to Int = " + upCastingSmallType);

        // multiple variables of the same type can be declared and initialized with comma separation
        int one = 1, two = 2, three = 3;

        System.out.println("Declared at the same line. One = " + one + ", Two = " + two + ", Three = " + three);
    }
}
