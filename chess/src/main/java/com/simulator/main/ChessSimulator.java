package com.simulator.main;

import java.util.List;
import java.util.Scanner;

public class ChessSimulator {

	public static void main(String[] args) {
		try (Scanner inputScan = new Scanner(System.in)) {
			 while (true) {
				System.out.println("Enter a piece type (e.g., King, Queen, Pawn) or type 'Exit' to quit: ");
				String inputPiece = inputScan.next();
				if (inputPiece.equalsIgnoreCase("Exit")) {
				    break;
				}
				System.out.println("Enter the position of the piece " + inputPiece + " (e.g., D5) : ");
				String inputCell = inputScan.next();
				if (inputCell.length() != 2 && !inputCell.matches("[A-Ha-h][1-8]")) {
					System.err.println("Invalid cell number");
					continue;
				}
				try {
				    Piece piece = PieceFactory.createPiece(inputPiece);
				    List<String> movements = piece.getMovements(inputCell);
				    String result = String.join(", ", movements);
				    System.out.println(result);
				} catch (IllegalArgumentException e) {
				    System.err.println(e.getMessage());
				}
			 }
		}
	}
}
