package com.examples.multithreading;

public class ThreadExampleMain {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("main method execution ends");
    }
}

class Book {
    String title;
    boolean isCompleted;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    
    
}

