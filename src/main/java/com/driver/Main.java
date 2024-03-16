package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Attempting to directly access private member variable "name"
        // Results in compilation error due to access restriction
        // obj.name = "John"; // Error: The field RWOnly.name is not visible

        // Attempting to print private member variable "name"
        // Also results in compilation error due to access restriction
        // System.out.println(obj.name); // Error: The field RWOnly.name is not visible

        // Setting value to "name" using setter function
        obj.setName("John");

        // Accessing value of "name" using getter function
        System.out.println("Name: " + obj.getName()); // Output: Name: John
    }
}