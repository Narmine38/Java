package fr.cedric.gamelibrary.tictactoe;

import fr.cedric.gamelibrary.factory.Game;

public class TicTacToe implements Game {

    @Override
    public void play() {
        System.out.println("TicTacToe");
        TicTacToeBoard board = new TicTacToeBoard();
        board.display();
    }
}
