package com.example.technogise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.models.Cell;

public class CellTest {
    Cell cell = new Cell(1, 'E');
    @Test
    public void positionShouldHaveCoordinateColumn() {
        Assertions.assertEquals(cell.getColumn(), 'E');
    }

    @Test
    public void positionShouldHaveCoordinateRow() {
        Assertions.assertEquals(cell.getRow(), 1);
    }

    @Test
    public void positionShouldBeCreatedFromText() {
        Cell position = new Cell("A3");
        Assertions.assertEquals(position.getRowNumer(), 3);
        Assertions.assertEquals(position.getColumnNumer(), 1);
    }
}
