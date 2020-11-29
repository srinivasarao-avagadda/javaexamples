package com.oops.constructor;

public class Employee extends Person {
    private int age;
    private String name;

    // parameter constructor
    public Employee(int age, String name) {
        super(name);
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e = new Employee(30, "srinivas");
        System.out.println(e.getName());
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
        System.out.println("person constructor");
    }
}
