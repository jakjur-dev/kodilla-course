package com.kodilla.rps;

public class ComputerMoveGenerator {

    public String generate(String difficulty, String playerMove) {

        int randomNumber2 = (int) (Math.random() * 99);

        if (difficulty.equals("normalny")) {
            int randomNumber = (int) (Math.random() * 3);

            if (randomNumber == 0) {
                return "kamień";
            } else if (randomNumber == 1) {
                return "papier";
            } else {
                return "nożyce";
            }
        } else if (difficulty.equals("trudny") && playerMove.equals("nożyce")) {
            if (randomNumber2 >= 0 && randomNumber2 <= 49) {
                return "kamień";
            } else if (randomNumber2 >= 50 && randomNumber2 <= 74) {
                return "nożyce";
            } else {
                return "papier";
            }
        } else if (difficulty.equals("trudny") && playerMove.equals("kamień")) {
            if (randomNumber2 >= 0 && randomNumber2 <= 49) {
                return "papier";
            } else if (randomNumber2 >= 50 && randomNumber2 <= 74) {
                return "nożyce";
            } else {
                return "kamień";
            }
        } else if (difficulty.equals("trudny") && playerMove.equals("papier")){
            if (randomNumber2 >= 0 && randomNumber2 <= 49) {
                return "nożyce";
            } else if (randomNumber2 >= 50 && randomNumber2 <= 74) {
                return "papier";
            } else {
                return "kamień";
            }
        } else if (difficulty.equals("łatwy") && playerMove.equals("nożyce")) {
            if (randomNumber2 >= 0 && randomNumber2 <= 49) {
                return "papier";
            } else if (randomNumber2 >= 50 && randomNumber2 <= 74) {
                return "nożyce";
            } else {
                   return "kamień";
            }
        } else if (difficulty.equals("łatwy") && playerMove.equals("kamień")) {
            if (randomNumber2 >= 0 && randomNumber2 <= 49) {
                return "nożyce";
            } else if (randomNumber2 >= 50 && randomNumber2 <= 74) {
                return "papier";
            } else {
                return "kamień";
            }
        } else {
            if (randomNumber2 >= 0 && randomNumber2 <= 49) {
                return "kamień";
            } else if (randomNumber2 >= 50 && randomNumber2 <= 74) {
                return "papier";
            } else {
                return "nożyce";
            }
        }
    }
}