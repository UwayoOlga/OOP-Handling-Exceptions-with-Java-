package main;

/* Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances, set their attributes using the constructor, and print their name and age. */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Uwayo", 25);
        Person person2 = new Person("Olga", 30);
        person1.display();
        person2.display();
    }
}
