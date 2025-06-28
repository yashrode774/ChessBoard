package com.example.technogise;

import com.models.Cell;

public interface IPiece {
    String getPossibleMoves(Cell cell);

    default int[] getPos(String position) {
        int row = Character.getNumericValue(position.charAt(1)) - 1;
        int col = Character.toUpperCase(position.charAt(0)) - 'A';
        return new int[]{row, col};
    }
}
