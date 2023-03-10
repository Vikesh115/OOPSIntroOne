package com.company;

public class Main {

    public static void main(String[] args) {
        // can we overload main method in java?
        // Yes, We can overload the main method in java but JVM only calls
        // the original main method, it will never call our overloaded main method.
        System.out.println("Original main method is caling"); 
        
        // create an object and call default or another type of constructor
        // Objects take Heap Space
        // Human vikesh = new Human(); // object 1
        // System.out.println("return from constructor");
        // vikesh.age = 22;
        // vikesh.weight = 60;
        // // vikesh.sleep();
        // // vikesh.eat();

        // Human obj = new Human(12, 70); // object 2
        // System.out.println("age is " + obj.age);

        // System.out.println("Number of object created " + Human.count);

        // Male Alpha = new Male();
        // Alpha.sleep();

        // Scorpio fav = new Scorpio();
        // fav.Intro();

        // mahindra fav = new mahindra();
        // fav.run(200,100);

        // FullTime work = new FullTime();
        // work.Employeework();

         dog goldy = new dog();
        goldy.speak();

    }

    public static void main(int args) {
        System.out.println("main() overloaded"
                + " method 1 Executing");
    }

    // Overloaded main method 2
    // According to us this overloaded method
    // Should be executed when character is passed
    public static void main(char args) {
        System.out.println("main() overloaded"
                + " method 2 Executing");
    }

    // Overloaded main method 3
    // According to us this overloaded method
    // Should be executed when double value is passed
    public static void main(Double[] args) {
        System.out.println("main() overloaded"
                + " method 3 Executing");
    }
}

class Male extends Human {

}

class Human {

    // properties
    // data member
    int age;
    int weight;

    // count give number of objects
    // Static data member belongs to class and prperty of class
    // static int count = 0;

    // default constructor

    // constructor is used to initialize the object
    // 2 types of constructor
    // no arg constructor
    public Human() {
        // count++;
        age = 0;
        System.out.println("Inside constructor create object");
    }

    // parameterized constructor
    public Human(int age, int weight) {
        // this(); // we can use and call for constructor
        // count++;
        this.age = age;
        this.weight = weight;
    }

    // constructor overloading
    public Human(int age) {
        // count++;
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
        // count++;
    }

}

// Inheritence

class Scorpio extends mahindra {

    void Intro() {
        System.out.println("This is Scorpio");
    }
}

class mahindra extends car {
    int rating;

    void intro() {
        System.out.println("This is Mahindra");
    }
}

class car {
    String color;
    int weight;

    void run() {
        System.out.println("Car is running");
    }

    // Method overloading and compile time polymorphism
    void run(int speed) {
        System.out.println("Car is runningnat speed " + speed);
    }

    int run(int distance,int speed) {
        System.out.println("Car is runningnat at speed " + speed + " and covers " + distance);
        return 0;
    }

    void stop() {
        System.out.println("Car is stoping");
    }
}

// Hierarical Inhertence

class FullTime extends Employee {
    int salary;

    void FullTimeWork() {
        System.out.println("I am Full Time Employee");
    }
}

class Intern extends Employee {
    int salary;

    void InternWork() {
        System.out.println("I am Intern");
    }
}

class Employee {
    // data memeber
    int salary;

    // data member function
    void Employeework() {
        System.out.println(" I am Employee");
    }
}

// Method overriding and run time polymorphism
class lion extends Animal{ 
  void speak() {
  System.out.println("Roar");
  }
}
class dog extends Animal{

    void speak() {
        System.out.println("woof");
    }
} 

class Animal{
    int age;
    int weight;

    void speak(){
        System.out.println("hayye");
    }
}