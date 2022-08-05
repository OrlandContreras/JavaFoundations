package com.learning.javafoundation.numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

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
        DecimalFormat df = new DecimalFormat("COP #,###.##");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("EN", "US"));
        BigDecimal balance = CompoundInterestCalc.calculate("10000.00", ".08", 10, "1000");
        System.out.println(currencyFormatter.format(balance.round(new MathContext(10, RoundingMode.HALF_UP))));
        // Custom format
        System.out.println(df.format(balance));

    }
}
