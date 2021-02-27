package com.kodilla.rps;

public class GameOuputValidator {

    public int[] validate (String playerMove, String computerMove, String playerName, int wins, int losses) {

        if ((playerMove.equals("kamień") && computerMove.equals("kamień")
                || playerMove.equals("papier") && computerMove.equals("papier")
                || playerMove.equals("nożyce") && computerMove.equals("nożyce"))) {
            System.out.println("Remis!");
        } else if (playerMove.equals("kamień") && computerMove.equals("nożyce")
                || playerMove.equals("papier") && computerMove.equals("kamień")
                || playerMove.equals("nożyce") && computerMove.equals("papier")) {
            wins++;
            System.out.println("Punkt dla: " + playerName);
        } else {
            losses++;
            System.out.println("Punkt dla komputera");
        }

        return new int[]{wins, losses};
    }
}
