package com.obscura.sample.test;
class Constructor {
    int roll;
    String name;

    // Constructor
    public Constructor(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.display();
    }

    // Method to display student information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }

    public static void main(String[] args) {
        // Create a new Constructor object
        Constructor student1 = new Constructor("Liya", 1);
        Constructor student2 = new Constructor("Riya", 2);
    }
}