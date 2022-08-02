package com.learning.javafoundation.numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// Working with number types, for example BigDecimal class.
public class NumberStuff {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(".03828435");
        BigDecimal num2 = new BigDecimal("5.321");

        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);

        System.out.println(num1.divide(num2, mc));
        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.sqrt(mc));
        System.out.println(num1.max(num2));
        System.out.println(num1.min(num2));
        System.out.println(num1.abs(mc));
        System.out.println(num2.remainder(new BigDecimal("2")));
    }
}
