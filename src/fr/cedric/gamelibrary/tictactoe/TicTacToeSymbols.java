package fr.cedric.gamelibrary.tictactoe;

import fr.cedric.gamelibrary.board.cell.symbol.GameSymbol;

public enum TicTacToeSymbols implements GameSymbol {
    X("X"),
    O("O");

    private final String representation;

    TicTacToeSymbols(String representation) {
        this.representation = representation;
    }


    @Override
    public String getSymbolRepresentation() {
        return this.representation;
    }
}
