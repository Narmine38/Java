package fr.cedric.gamelibrary.utils;

import fr.cedric.gamelibrary.view.View;

import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    private static final InputValidator inputValidator = new InputValidator();

    public static String getValidatedInput() {

        String input = scanner.nextLine();

        while (!inputValidator.isValid(input)) {

            View.noValideTypeGame();
            input = scanner.nextLine();
        }

        return input;
    }
}
