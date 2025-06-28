package com.example.technogise;

import com.models.Board;
import com.models.Cell;
import org.springframework.beans.factory.annotation.Autowired;

public class Moves {

    boolean isValid(Cell pos, Board board) {
        if (board.getMaxRows() <= pos.getRow() && board.getMaxColumns() <= pos.getColumnNumer())
            return  true;
        return false;
    }

    Cell moveUp(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow()+ 1, cell.getColumn());
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }

    Cell moveDown(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow() - 1, cell.getColumn());
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }

    Cell moveRight(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow(), (char) (cell.getColumn() + 1));
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }

    Cell moveLeft(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow(), (char) (cell.getColumn() - 1));
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }

    Cell moveRightUp(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow() + 1, (char) (cell.getColumn() + 1));
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }

    Cell moveRightDown(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow() + 1, (char) (cell.getColumn() - 1));
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }

    Cell moveLeftUp(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow() + 1, (char) (cell.getColumn() - 1));
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }

    Cell moveLeftDown(Cell cell, Board board) {
        Cell newPos = new Cell(-1, 'Z');
        newPos = new Cell(cell.getRow() - 1, (char) (cell.getColumn() - 1));
        if (isValid(newPos, board))
            return newPos;
        return newPos;
    }
}
