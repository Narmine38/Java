package fr.cedric.gamelibrary.tictactoe;

import fr.cedric.gamelibrary.board.cell.GameCell;

public class TicTacToeCell implements GameCell {

    @Override
    public String getRepresentation() {
        return "|   ";
    }
}
