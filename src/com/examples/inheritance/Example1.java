package com.examples.inheritance;

public class Example1 extends Example2 {
    
    int a = 10;
    public static void main(String[] args) {
        Example1 eg = new Example1();
        System.out.println(eg.b);
    }

}

class Example2 {
    int b = 11;
    
}
