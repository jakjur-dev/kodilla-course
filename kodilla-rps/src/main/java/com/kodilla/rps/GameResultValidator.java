package com.kodilla.rps;

public class GameResultValidator {

    public void validate(int wins, int losses, String playerName){

        if (wins > losses){
            System.out.println("Gra zakończona - wygrał/a: " + playerName);
        } else if (wins == losses) {
            System.out.println("Gra zakończona remisem - gracze posiadają tyle samo zwycięstw!");
        } else {
            System.out.println("Gra zakończona - wygrał komputer");
        }
    }
}
