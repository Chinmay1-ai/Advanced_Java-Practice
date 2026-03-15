package com.practice;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Test {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age must be 18+");
        System.out.println("Valid Age");
    }

    public static void main(String[] args) throws InvalidAgeException {
        checkAge(16);
    }
}

