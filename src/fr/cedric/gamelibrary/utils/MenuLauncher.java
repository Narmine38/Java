package fr.cedric.gamelibrary.utils;

import fr.cedric.gamelibrary.factory.Game;
import fr.cedric.gamelibrary.factory.GameFactory;
import fr.cedric.gamelibrary.factory.GameType;
import fr.cedric.gamelibrary.view.View;

public class MenuLauncher {
    private final GameType gameType;

    public MenuLauncher() {
        View.selectGame();
        for (GameType gameType : GameType.values()) {
            System.out.println(gameType);
        }
        String userInput = UserInput.getValidatedInput();
        this.gameType = getGameTypeFromUserInput(userInput);
    }

    public void startGame() {
        View.welcome(gameType);
        Game game = GameFactory.createGame(gameType);
        game.play();
    }

    private GameType getGameTypeFromUserInput(String userInput) {
        return GameType.valueOf(userInput.toUpperCase().trim());
    }
}