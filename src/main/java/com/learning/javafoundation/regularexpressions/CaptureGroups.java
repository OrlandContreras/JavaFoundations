package com.learning.javafoundation.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {
        String regex = "(?<countryCode>\\d{1,2}[-.,\\s]?)?(?<areaCode>\\d{3}[-.,\\s]?)(?<exchange>\\d{3}[-.,\\s]?)(?<lineNumber>\\d{4,})";
        String phoneNumber = "57 321-333-7652";
        // System.out.println(phoneNumber.matches(regex));
        Pattern phoneNumberPat = Pattern.compile(regex);
        Matcher phoneNumberMat = phoneNumberPat.matcher(phoneNumber);

        if (phoneNumberMat.matches()) {
            System.out.println(phoneNumberMat.group("countryCode"));
            System.out.println(phoneNumberMat.group("areaCode"));
            System.out.println(phoneNumberMat.group("exchange"));
            System.out.println(phoneNumberMat.group("lineNumber"));
            System.out.println(phoneNumberMat.group(0));

        }
    }
}
