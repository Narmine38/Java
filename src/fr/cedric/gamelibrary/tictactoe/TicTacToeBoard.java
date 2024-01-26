package fr.cedric.gamelibrary.tictactoe;


import fr.cedric.gamelibrary.board.Board;

public class TicTacToeBoard extends Board<TicTacToeCell> {

    public TicTacToeBoard() {
        this.board = new TicTacToeCell[3][3];
        initialize();
    }

    @Override
    protected TicTacToeCell createCellInstance() {
        return new TicTacToeCell();
    }
}
