package com.learning.javafoundation.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {
        String regex = """
                    # This is regex to parse the parts of a phone number
                    (?:(?<countryCode>\\d{1,2})[-.,\\s]?)? # Get's country code
                    (?<areaCode>\\d{3})[-.,\\s]? # Get's area code
                    (?<exchange>\\d{3})[-.,\\s]? # Get's exchange
                    (?<lineNumber>\\d{4,}) # Get's line number
                    """;
        String phoneNumber = "57 321.333-7652";

        Pattern phoneNumberPat = Pattern.compile(regex, Pattern.COMMENTS);  // Comments in regular expressions
        Matcher phoneNumberMat = phoneNumberPat.matcher(phoneNumber);

        if (phoneNumberMat.matches()) {
            System.out.println("Country code: ".concat(phoneNumberMat.group("countryCode")));
            System.out.println("Area code: ".concat(phoneNumberMat.group("areaCode")));
            System.out.println("Exchange: ".concat(phoneNumberMat.group("exchange")));
            System.out.println("Line number: ".concat(phoneNumberMat.group("lineNumber")));
            System.out.println("Complete number: ".concat(phoneNumberMat.group(0)));

        }
    }
}
