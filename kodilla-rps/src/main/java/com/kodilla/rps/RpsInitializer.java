package com.kodilla.rps;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RpsInitializer {
    public InputValidator initialize(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę gracza");
        String playerName = scanner.nextLine();

        while (playerName.equals("")){
            System.out.println("Podaj nazwę gracza (wartość nie może pozostać pusta!)");
            playerName = scanner.nextLine();
        }

        System.out.println("Podaj maksymalną liczbę punktów");
        String maxWins = scanner.nextLine();

        while (Pattern.matches("[a-zA-Z]+", maxWins) || maxWins.equals("")) {
            System.out.println("Podaj liczbę całkowitą!");
            maxWins = scanner.nextLine();
        }

        System.out.println("Podaj poziom trudności (łatwy/normalny/trudny)");
        String difficulty = scanner.nextLine();

        while (!difficulty.equals("normalny") && !difficulty.equals("trudny") && !difficulty.equals("łatwy")) {
            System.out.println("Wpisz \"łatwy\", \"normalny\" lub \"trudny\"");
            difficulty = scanner.nextLine();
        }

        System.out.println("klawisz 1 – zagranie \"kamień\"");
        System.out.println("klawisz 2 – zagranie \"papier\"");
        System.out.println("klawisz 3 – zagranie \"nożyce\"");
        System.out.println("klawisz x – zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\"");
        System.out.println("klawisz n – uruchomienie gry od nowa");

        return new InputValidator(Integer.parseInt(maxWins), playerName, difficulty);
    }
}
