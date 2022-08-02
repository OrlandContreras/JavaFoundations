package com.learning.javafoundation.numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Excersise: Balance(Y) = P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r ]
 *  P = principal
 *  r = rate
 *  Y = period
 *  c = contribution
 * **/
public class CompoundInterestCalc {
    public static BigDecimal calculate(String principal, String rate, int period, String contribution) {
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)); // (1 + r)
        BigDecimal b = a.pow(period); // (1 + r)^Y
        BigDecimal c = b.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)
        BigDecimal d = c.divide(new BigDecimal(rate), new MathContext(10, RoundingMode.HALF_UP)); // ((1 + r)^Y - 1) / r
        BigDecimal e = d.multiply(new BigDecimal(contribution)); // c[ ((1 + r)^Y - 1) / r ]
        BigDecimal f = b.multiply(new BigDecimal(principal)); // P(1 + r)^Y

        return f.add(e); // P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r ]

    }

    public static void main(String[] args) {
        BigDecimal balance = CompoundInterestCalc.calculate("10000.00", ".08", 10, "1000");
        System.out.println(balance.round(new MathContext(10, RoundingMode.HALF_UP)));

    }
}
