package com.simulator.main;

public class PieceFactory {
	public static Piece createPiece(String type) {
		return switch (type.toUpperCase()) {
			case "KING" -> new King();
			case "PAWN" -> new Pawn();
			case "QUEEN" -> new Queen();
			default -> throw new IllegalArgumentException("Invalid piece type: " + type + " \nValid piece types in this application: King, Queen and Pawn");
		};
	}
}
