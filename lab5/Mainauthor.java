package com.adhithiya.lab5;

public class Mainauthor {
    public static void main(String[] args) {
        author d1 = new author("arun", "arun2003", 'm');
        System.out.println(d1); // toString()
        // Test Setters and Getters
        d1.setEmail("adhithiya@2");
        System.out.println(d1); // toString()
        System.out.println("Name: " + d1.getName());
        System.out.println("Email: " + d1.getEmail());
        System.out.println("Gender: " + d1.getGender());
    }
}
