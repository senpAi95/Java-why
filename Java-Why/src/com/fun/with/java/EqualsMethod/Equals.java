package com.fun.with.java.EqualsMethod;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        // Create three String objects.
        String strA = new String("APPLES");
        String strB = new String("APPLES");
        String strC = new String("ORANGES");

        // Create a String reference and assign an existing String's reference to it
        // so that both references point to the same String object in memory.
        String strD = strA;

        System.out.println(strA == strB); // false
        System.out.println(strA == strC); // false
        System.out.println(strA == strD); // true

        System.out.println(strA.equals(strB)); // true
        System.out.println(strA.equals(strC)); // false
        System.out.println(strA.equals(strD)); // true
    }
}
