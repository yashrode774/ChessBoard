package com.example.technogise;

import com.models.Board;
import com.models.Cell;

import java.util.Scanner;

public class Game {
    public Board board;
    public Game() {
        board = new Board(8, 8);
    }

    public void startGame() {
        while (true) {
            System.out.println("Enter piece and position, separated by comma:");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            String piece = input.split(",")[0];
            String position = input.split(",")[1].trim();

            IPiece currPiece = PieceFactory.getPiece(piece, board);
            String possiblePositions = currPiece.getPossibleMoves(new Cell(position));
            System.out.println(possiblePositions);


            System.out.println("Do you want to continue(yes/no):");
            if (sc.nextLine().toLowerCase().equals("yes")) ;
            else {
                System.out.println("The end.");
                return;
            }
        }
    }
}
