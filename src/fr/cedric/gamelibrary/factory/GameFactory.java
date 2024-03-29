package fr.cedric.gamelibrary.factory;

import fr.cedric.gamelibrary.gomoku.Gomoku;
import fr.cedric.gamelibrary.puissance4.Puissance4;
import fr.cedric.gamelibrary.tictactoe.TicTacToe;

public class GameFactory {
    public static Game createGame(GameType type) {
        return switch (type) {
            case TICTACTOE -> new TicTacToe();
            case GOMOKU -> new Gomoku();
            case PUISSANCE4 -> new Puissance4();
        };
    }
}

