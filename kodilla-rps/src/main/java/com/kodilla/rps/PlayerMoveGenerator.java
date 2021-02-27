package com.kodilla.rps;

public class PlayerMoveGenerator {

    public String generate(String playerNumber) {

        if (playerNumber.equals("1")) {
            return "kamień";
        } else if (playerNumber.equals("2")) {
            return "papier";
        } else {
            return "nożyce";
        }
    }
}
