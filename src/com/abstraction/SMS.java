package com.abstraction;
// School Management System

abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void displayDetails();
}

class Student extends Person {
    private int marks;

    public Student(String name, int marks) {
        super(name);
        this.marks = marks;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    private String calculateGrade() {
        if (marks >= 75) return "A";
        else if (marks >= 50) return "B";
        else return "C";
    }
}
public class SMS {

	public static void main(String[] args) {
		Student s1 = new Student("Ajinkya", 80);
        s1.displayDetails();

	}

}
