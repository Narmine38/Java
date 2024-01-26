package fr.cedric.gamelibrary.board;

import fr.cedric.gamelibrary.board.cell.GameCell;

public abstract class Board<CELL extends GameCell> implements GameBoard<CELL>{

    protected CELL[][] board;
    protected abstract CELL createCellInstance();


    @Override
    public void initialize() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                this.board[i][j] = this.createCellInstance();
            }
        }
    }

    public void display() {
        String lineSeparator = "-".repeat(board.length * 4);
        for(int i = 0; i < board.length; i++) {
            System.out.println(lineSeparator);
            for(int j = 0; j < board.length; j++) {
                System.out.print(this.board[i][j].getRepresentation());
            }
            System.out.println("|");
        }
        System.out.println(lineSeparator);
    }

}
