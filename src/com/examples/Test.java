package com.examples;

public class Test {
    static String str = "abc";
    public static void main(String[] args) {
        str = "abcd";
        Test test = new Test();
        System.out.println(test.str);
    }
}
