package com.company;
// oops 
public class Main {

    public static void main(String[] args) {
        // create an object and call default or another type of constructor
        // Objects take Heap Space
        Human vikesh = new Human(); // object 1
        System.out.println("return from constructor");
        vikesh.age = 22;
        vikesh.weight = 60;
        // vikesh.sleep();
        // vikesh.eat();

        Human obj = new Human(12, 70); // object 2
        System.out.println("age is " + obj.age);

        System.out.println("Number of object created " + Human.count);
        vikesh.sleep();
    }
}

class Human {

    // properties
    // data member
    int age;
    int weight;

    // count give number of objects
    // Static data member belongs to class and prperty of class
    static int count = 0;

    // default constructor

    // constructor is used to initialize the object
    // 2 types of constructor
    // no arg constructor
    public Human() {
        count++;
        age = 0;
        System.out.println("Inside constructor create object");
    }

    // parameterized constructor
    public Human(int age, int weight) {
        //this(); // we can use and call for constructor
        count++;
        this.age = age;
        this.weight = weight;
    }

    // constructor overloading
    public Human(int age) {
        count++;
        this.age = age;
    }

    // behaviour
    // class Fuction
    void sleep() {
        System.out.println("sleeping");
    }

    void eat() {
        System.out.println("eating");
    }

    static void update() {
        count++;
    }

}
