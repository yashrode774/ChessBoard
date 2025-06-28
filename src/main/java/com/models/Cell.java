package com.models;

public class Cell {
    private int row;
    private char column;

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    public int getColumnNumer() {
        return 'A' - column + 1;
    }

    public int getRowNumer() {
        return row;
    }

    public Cell(int row, char column) {
        this.row = row;
        this.column = column;
    }

    public Cell(String cellPosition) {
        this.row = Character.getNumericValue(cellPosition.charAt(1));
        this.column = cellPosition.charAt(0);
    }

    @Override
    public String toString() {
        return row + "" + column;
    }
}
