package com.simulator.main;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class QueenTest {
	
	Queen queen;
	
	@BeforeEach
	public void setUp() {
		queen = new Queen();
	}
	
	
	@Test
    public void testGetMovementsFromCenter() {
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
        assertTrue(expected.containsAll(movements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromRightUpCorner() {
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
        assertTrue(expected.containsAll(movements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromLeftUpCorner() {
        List<String> movements = queen.getMovements("B7");
        List<String> expected = List.of(
            "B8", // Vertical up
            "B1", "B2", "B3", "B4", "B5", "B6", // Vertical down
            "C7", "D7", "E7", "F7", "G7", "H7",// Horizontal right
            "A7", // Horizontal left
            "C8", // Diagonal up-right
            "A6", // Diagonal down-left
            "C6","D5","E4","F3","G2","H1", // Diagonal down-right
            "A8"  // Diagonal up-left
        );
        assertTrue(expected.containsAll(movements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromBottomDownCorner() {
        List<String> movements = queen.getMovements("A1");
        List<String> expected = List.of(
        	"A2", "A3", "A4", "A5", "A6", "A7", "A8", // Vertical up
             // Vertical down
            "B1", "C1", "D1", "E1", "F1", "G1", "H1",// Horizontal right
            // Horizontal left
            "B2", "C3", "D4", "E5", "F6", "G7", "H8" // Diagonal up-right
            // Diagonal down-left
            // Diagonal down-right
            // Diagonal up-left
        );
        assertTrue(expected.containsAll(movements), "All expected movements should be present.");
    }
	
}
