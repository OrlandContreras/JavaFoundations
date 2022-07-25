package com.learning.javafoundation.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {
        String regex = "(\\d{1,2}[-.,\\s]?)?(\\d{3}[-.,\\s]?)(\\d{3}[-.,\\s]?)(\\d{4,})";
        String phoneNumber = "57 321-333-7652";
        // System.out.println(phoneNumber.matches(regex));
        Pattern phoneNumberPat = Pattern.compile(regex);
        Matcher phoneNumberMat = phoneNumberPat.matcher(phoneNumber);

        if (phoneNumberMat.matches()) {
            System.out.println(phoneNumberMat.group(1));
            System.out.println(phoneNumberMat.group(2));
            System.out.println(phoneNumberMat.group(3));
            System.out.println(phoneNumberMat.group(4));
            System.out.println(phoneNumberMat.group(0));

        }
    }
}
