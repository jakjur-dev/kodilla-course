package com.kodilla.rps;

public class PlayerMoveGenerator {

    public String generate(String playerNumber) {

        String playerMove = "";
        if (playerNumber.equals("1")) {
            return playerMove = "kamień";
        } else if (playerNumber.equals("2")) {
            return playerMove = "papier";
        } else {
            return playerMove = "nożyce";
        }
    }
}
