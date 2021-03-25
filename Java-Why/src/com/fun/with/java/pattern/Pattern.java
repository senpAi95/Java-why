package com.fun.with.java.pattern;

import java.util.regex.Matcher;

public class Pattern {
    public static void main(String[] args) {
        String input = "Lions, and tigers, and bears! Oh, my!";

        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
                "lion|cat|dog|wolf|bear|humar|tiger|liger");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println("Found a " + matcher.group() + ".");
        }
    }
}

// Found a tiger.
// Found a bear.