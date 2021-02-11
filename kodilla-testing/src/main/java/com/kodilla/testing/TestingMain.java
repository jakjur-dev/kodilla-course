package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        System.out.println("Test - pierwszy test jednostkowy:");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");

        }//test dodawania
        System.out.println("Test - drugi test jednostkowy (dodawanie):");

        Calculator calculator = new Calculator();

        int addResult = Calculator.add(1,5);

        if (addResult == 6) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //test odejmowania
        System.out.println("Test - trzeci test jednostkowy (odejmowanie):");
        int subtractResult = Calculator.subtract(1,5);

        if (subtractResult == -4) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
