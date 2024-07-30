package com.simulator.main;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PawnTest {
	Pawn pawn;
	
	@BeforeEach
	public void setUp() {
		pawn = new Pawn();
	}
	
	@Test
    public void testGetMovementsFromCenter() {
        List<String> expectedMovements = List.of("D6");       
        List<String> actualMovements = pawn.getMovements("D5");
        assertEquals(expectedMovements, actualMovements);
    }
	
	@Test
    public void testGetMovementsFromLeftBottomCorner() {
        List<String> expectedMovements = List.of("A2");       
        List<String> actualMovements = pawn.getMovements("A1");
        assertEquals(expectedMovements, actualMovements);
    }
	
	@Test
    public void testGetMovementsFromTopCorner() {
		InvalidMoveException exception = assertThrows(InvalidMoveException.class, () -> {
            pawn.getMovements("H8");
        });
        String expectedMessage = "The Pawn will not be able to move forward as the position, H8 , is the end of the Chess board game";   
        assertTrue(expectedMessage.equals(exception.getMessage()));
    }
}
