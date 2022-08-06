package com.learning.javafoundation.calculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public String calAnnuity(String R, int t, String r, int n) {
        BigDecimal a = new BigDecimal(r).divide(new BigDecimal(n)); // r / n
        BigDecimal b = BigDecimal.ONE.add(a); // (1 + (r/n))
        BigDecimal c = b.pow(n * t); // (1 + (r/n))^(n*t)
        BigDecimal d = c.subtract(BigDecimal.ONE); // ((1 + (r/n))^(n*t)) - 1
        BigDecimal e = d.divide(a); // (((1 + (r/n))^(n*t)) - 1 ) / (r/n)
        BigDecimal f = e.multiply(new BigDecimal(R)); // R ((((1 + (r/n))^(n*t)) - 1 ) / (r/n))
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyInstance.format(f);
    }
}
