package com.example.technogise;

import com.models.Board;

public class PieceFactory {

    public static IPiece getPiece(String pieceType, Board board) {
        switch (pieceType) {
            case "Pawn":
                return new Pawn(board);
            case "King":
                return new King(board);
            // Add more cases here for other pieces like Bishop, Queen, etc.
            default:
                throw new IllegalArgumentException("Unknown piece type: " + pieceType);
        }
    }
}

