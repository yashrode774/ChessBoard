package com.models;

public class Board {
    int maxRows;
    int maxColumns;

    public void setMaxColumns(int maxColumns) {
        this.maxColumns = maxColumns;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    public int getMaxRows() {
        return maxRows;
    }

    public int getMaxColumns() {
        return maxColumns;
    }

    public Board(int rows, int columns) {
        this.maxRows = rows;
        this.maxColumns = columns;
    }
}