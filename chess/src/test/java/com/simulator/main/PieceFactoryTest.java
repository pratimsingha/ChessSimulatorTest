package com.simulator.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class PieceFactoryTest {
	
	@Test
	public void testCreateKing() {
		Piece king = PieceFactory.createPiece("King");
		assertNotNull(king);
		assertTrue(king instanceof King);
	}
	
	@Test
	public void testCreateKPawn() {
		Piece pawn = PieceFactory.createPiece("Pawn");
		assertNotNull(pawn);
		assertTrue(pawn instanceof Pawn);
	}
	
	@Test
	public void testCreateQueen() {
		Piece queen = PieceFactory.createPiece("Queen");
		assertNotNull(queen);
		assertTrue(queen instanceof Queen);
	}
	
	@Test
	public void testCreateInvalidPiece() {
		
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> PieceFactory.createPiece("Rook"));
		String expectedMessage = "Invalid piece type: Rook \nValid piece types in this application: King, Queen and Pawn";
		assertTrue(expectedMessage.equals(illegalArgumentException.getMessage()));
	}

}
