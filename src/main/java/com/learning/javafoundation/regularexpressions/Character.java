package com.learning.javafoundation.regularexpressions;

public class Character {
    public static void main(String[] args) {
        // DOT: You can use any character
        // ?: You can use zero or one
        System.out.println("doggy".matches("^?\\b.....$"));
        // \\s: Space \\S: Search one character different to space.
        System.out.println("cat doggy".matches("...\\s\\b.....$"));
        // \\w \\W: Works only character not numbers
        System.out.println("---".matches("\\W\\W\\W"));
    }
}
