package com.fun.with.java.ValueOf;

public class IntegerValueOf {
    public static void main(String[] args) {
        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt)); // 495053715
        System.out.println(System.identityHashCode(secondInt)); // 495053715
        System.out.println(System.identityHashCode(thirdInt)); // 1922154895
    }
}
