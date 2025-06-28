package com.example.technogise;

import com.models.Board;
import com.models.Cell;

public class Pawn implements IPiece{

    Board board;
    Pawn(Board board) {
        this.board = board;
    }

    @Override
    public String getPossibleMoves(Cell cell) {



        StringBuilder ansString = new StringBuilder();
        Moves moves = new Moves();
        Cell newCell = moves.moveUp(cell, board);
        if (newCell.getRow() != -1)
            return newCell.getColumn() + "" +  (newCell.getRowNumer());
        return "";
    }
}
