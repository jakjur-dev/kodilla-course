package com.kodilla.rps;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValidator {

    String playerName;
    int maxWins;
    String difficulty;
    int wins = 0;
    int losses = 0;

    public InputValidator(int maxWins, String playerName, String difficulty) {
        this.maxWins = maxWins;
        this.playerName = playerName;
        this.difficulty = difficulty;
    }
    GameResultValidator gameResultValidator = new GameResultValidator();
    GameOuputValidator gameOuputValidator = new GameOuputValidator();
    Scanner scanner = new Scanner(System.in);

    public boolean validate(String myMove){

        boolean end = false;
        if (myMove.equals("x")) {

            System.out.println("Czy na pewno zakończyć grę? (tak/nie)");
            String confirm = scanner.nextLine();

            while (!confirm.equals("tak") && !confirm.equals("nie")) {
                System.out.println("Wpisz \"tak\" lub \"nie\"");
                confirm = scanner.nextLine();
            }

            if (confirm.equals("tak")) {
                end = true;
            } else {
                System.out.println("Wznowiono grę");
            }

        } else if (myMove.equals("n")) {

            System.out.println("Czy na pewno zakończyć aktualną grę? (tak/nie)");
            String confirm = scanner.nextLine();

            while (!confirm.equals("tak") && !confirm.equals("nie")) {
                System.out.println("Wpisz \"tak\" lub \"nie\"");
                confirm = scanner.nextLine();
            }

            if (confirm.equals("tak")) {
                System.out.println("Wynik zresetowany!");
                wins = 0;
                losses = 0;
            } else {
                System.out.println("Wznowiono grę");
            }

        } else if  (wins >= maxWins || losses >= maxWins) {
            System.out.println("Zła wartość");
            return end;
        } else if (!myMove.equals("1") && !myMove.equals("2") && !myMove.equals("3")) {
            System.out.println("Zła wartość!");

        } else {
            //Move generators
            String playerMove = new PlayerMoveGenerator().generate(myMove);
            String computerMove = new ComputerMoveGenerator().generate(difficulty, playerMove);

            System.out.println("Komputer wybrał: " + computerMove);
            System.out.println("Gracz wybrał: " + playerMove);

            //Output validator
            int[] output = gameOuputValidator.validate(playerMove, computerMove, playerName, wins, losses);
            wins = output[0];
            losses = output[1];
            System.out.println(playerName+ ": " + wins + ", Komputer: " + losses);
        }

        if  (wins >= maxWins || losses >= maxWins) {
            gameResultValidator.validate(wins, losses, playerName);
            System.out.println("Zakończyć grę (x), czy zrestartować (n)?");
        }

        return end;
    }
}
