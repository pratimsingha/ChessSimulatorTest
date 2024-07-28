package com.simulator.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class QueenTest {
	@Test
    public void testGetMovementsFromCenter() {
        Queen queen = new Queen();
        List<String> movements = queen.getMovements("D4");
        List<String> expected = List.of(
            "D5", "D6", "D7", "D8", // Vertical up
            "D3", "D2", "D1", // Vertical down
            "E4", "F4", "G4", "H4", // Horizontal right
            "C4", "B4", "A4", // Horizontal left
            "E5", "F6", "G7", "H8", // Diagonal up-right
            "C3", "B2", "A1", // Diagonal down-left
            "E3", "F2", "G1", // Diagonal down-right
            "C5", "B6", "A7"  // Diagonal up-left
        );
        assertEquals(expected.size(), movements.size(), "The number of movements should match.");
        assertTrue(expected.containsAll(movements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromRightUpCorner() {
        Queen queen = new Queen();
        List<String> movements = queen.getMovements("G7");
        List<String> expected = List.of(
            "G8", // Vertical up
            "G1", "G2", "G3", "G4", "G5", "G6", // Vertical down
            "H7", // Horizontal right
            "A7", "B7", "C7", "D7", "E7", "F7", // Horizontal left
            "H8", // Diagonal up-right
            "F6", "E5", "D4", "C3", "B2", "A1", // Diagonal down-left
            "H6", // Diagonal down-right
            "F8"  // Diagonal up-left
        );
        assertEquals(expected.size(), movements.size(), "The number of movements should match.");
        assertTrue(expected.containsAll(movements), "All expected movements should be present.");
    }
	
}
