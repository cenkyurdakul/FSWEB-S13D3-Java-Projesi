package com.workintech.model;

public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] pets;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary, boolean isMarried, String[] pets){
        this(firstName,lastName,age);
        this.salary = salary;
        this.isMarried = isMarried;
        this.pets = pets;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age>=13 && age<=19;
    }

    @Override
    public String toString() {
        //return "Firstname: "+ firstName + " Lastname: " + lastName + " Age: " + age;
    return String.format("Firstname: %s, Lastname: %s, Age: %d, Salary: %.2f",
            firstName, lastName, age, salary);
    }

}
