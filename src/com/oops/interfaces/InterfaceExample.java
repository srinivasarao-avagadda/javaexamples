package com.oops.interfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        Room r = new SimpleRoom();
        r.showRoom();
        
        r = new SpecialRoom();
        r.showRoom();

    }
}

interface Room {
    public void showRoom();
}

class SimpleRoom implements Room {

    @Override
    public void showRoom() {
        System.out.println("show simple room");
    }
}

class SpecialRoom implements Room {

    @Override
    public void showRoom() {
        System.out.println("show special room");
    }

}
