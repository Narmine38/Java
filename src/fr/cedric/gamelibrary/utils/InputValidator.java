package fr.cedric.gamelibrary.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    private static final String VALID_NUMBER_REGEX = "[a-zA-Z0-9]*";

    private final Pattern pattern = Pattern.compile(VALID_NUMBER_REGEX);

    public boolean isValid(String userInput) {
        Matcher matcher = pattern.matcher(userInput);

        return matcher.matches();
    }
}
