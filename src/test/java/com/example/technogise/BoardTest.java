package com.example.technogise;

import com.models.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoardTest {

    Board board = new Board(8, 8);
    @Test
    public void testBoardHasMaxEightRows() {
        Assertions.assertEquals(board.getMaxRows(),  8);
    }

    @Test
    public void testBoardHasMaxEightCols() {
        Assertions.assertEquals(board.getMaxColumns(),  8);
    }
}

