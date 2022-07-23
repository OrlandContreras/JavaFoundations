package com.learning.javafoundation.regularexpressions;

public class RegexPractice {
    public static void main(String[] args) {
        // Regex expressions are Case-Sensitives. For example:
        System.out.println("Dog".matches("dog"));
        // Saying that word can start with d o D. For example:
        System.out.println("Dog".matches("[dD]og"));
        // Working with range the letter. For example
        System.out.println("dog".matches("[a-fA]og"));
        // UpperCase
        System.out.println("Cat".matches("[^c]at"));
        System.out.println("Lat".matches("[^a-z]at"));
        // Scape character
        System.out.println("Lat".matches("\\wat"));
        System.out.println("_at".matches("\\wat"));
        System.out.println("dat".matches("\\w\\w\\w")); // Any word with three character
        System.out.println("1".matches("\\d")); // working digits
        System.out.println("1a3".matches("\\d\\d\\d"));
        System.out.println("321-333-7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));
        System.out.println("321.333.7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));
        System.out.println("321,333,7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));
        System.out.println("321,333 7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));
        System.out.println("321,333  7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));
        System.out.println("321,333  7652".matches("\\d{3}[-.,\\s]+\\d{3}[-.,\\s]+\\d{4}")); // one o more
        System.out.println("3213337652".matches("\\d{3}[-.,\\s]+\\d{3}[-.,\\s]+\\d{4}"));
        System.out.println("3213337652".matches("\\d{3}[-.,\\s]*\\d{3}[-.,\\s]*\\d{4}")); // zero o more
        System.out.println("321  333 7652".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4}"));
        System.out.println("321333 7652".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4}")); // zero o just one
        System.out.println("321333 76529".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,4}"));
        System.out.println("321333 7652".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,4}")); // Three or four digits
        System.out.println("321333 7652324324234523".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,}")); // Three or many digits
        System.out.println("321333 76".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,}"));

    }
}
