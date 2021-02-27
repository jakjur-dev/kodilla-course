package com.kodilla.rps;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InputValidator inputValidator = new RpsInitializer().initialize();

        boolean end = false;
        while (!end) {
            String myMove = scanner.nextLine();
            end = inputValidator.validate(myMove);
        }
    }
}
