package com.example.technogise;

import com.models.Board;
import com.models.Cell;

public class King implements IPiece{

    Board board;
    King(Board board) {
        this.board = board;
    }

    @Override
    public String getPossibleMoves(Cell cell) {
        StringBuilder ansString = new StringBuilder();

        Moves moves = new Moves();

        Cell newCell;
        newCell = moves.moveUp(cell, board);
        if (newCell.getRow() != -1)
            ansString.append(newCell.getColumn() + "" +  (newCell.getRowNumer()));

        newCell = moves.moveDown(cell, board);
        if (newCell.getRow() != -1)
            ansString.append( ", " + newCell.getColumn() + "" +  (newCell.getRowNumer()));

        newCell = moves.moveLeft(cell, board);
        if (newCell.getRow() != -1)
            ansString.append(", " + newCell.getColumn() + "" +  (newCell.getRowNumer()));

        newCell = moves.moveRight(cell, board);
        if (newCell.getRow() != -1)
            ansString.append( ", " + newCell.getColumn() + "" +  (newCell.getRowNumer()));


        newCell = moves.moveRightUp(cell, board);
        if (newCell.getRow() != -1)
            ansString.append(", " + newCell.getColumn() + "" +  (newCell.getRowNumer()));

        newCell = moves.moveRightDown(cell, board);
        if (newCell.getRow() != -1)
            ansString.append(", " + newCell.getColumn() + "" +  (newCell.getRowNumer()));

        newCell = moves.moveLeftUp(cell, board);
        if (newCell.getRow() != -1)
            ansString.append( ", " + newCell.getColumn() + "" +  (newCell.getRowNumer()));

        newCell = moves.moveLeftDown(cell, board);
        if (newCell.getRow() != -1)
            ansString.append(", " + newCell.getColumn() + "" +  (newCell.getRowNumer()));
        return ansString.toString();
    }
}
