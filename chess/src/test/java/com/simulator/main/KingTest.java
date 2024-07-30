package com.simulator.main;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KingTest {
	King king;
	
	@BeforeEach
	public void setUp() {
		king = new King();
	}
	
	@Test
    public void testGetMovementsFromCenter() {
        List<String> expectedMovements = List.of("C4","C5", "C6", "D4", "D6", "E4", "E5", "E6");       
        List<String> actualMovements = king.getMovements("D5");
        assertTrue(expectedMovements.containsAll(actualMovements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromLeftBottomCorner() {
        List<String> expectedMovements = Arrays.asList("A2", "B1", "B2");
        List<String> actualMovements = king.getMovements("A1");
        assertTrue(expectedMovements.containsAll(actualMovements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromRightBottomCorner() {
        List<String> expectedMovements = Arrays.asList("G1", "G2", "H2");
        List<String> actualMovements = king.getMovements("H1");
        assertTrue(expectedMovements.containsAll(actualMovements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromLeftUpCorner() {
        List<String> expectedMovements = Arrays.asList("A7", "B7", "B8");
        List<String> actualMovements = king.getMovements("A8");
        assertTrue(expectedMovements.containsAll(actualMovements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromRightUpCorner() {
        List<String> expectedMovements = Arrays.asList("G7", "G8", "H7");
        List<String> actualMovements = king.getMovements("H8");
        assertTrue(expectedMovements.containsAll(actualMovements), "All expected movements should be present.");
    }
	
	@Test
    public void testGetMovementsFromRightMiddleCorner() {
        List<String> expectedMovements = Arrays.asList("G3", "G4", "G5", "H3", "H5");
        List<String> actualMovements = king.getMovements("H4");
        assertTrue(expectedMovements.containsAll(actualMovements), "All expected movements should be present.");
    }
}
