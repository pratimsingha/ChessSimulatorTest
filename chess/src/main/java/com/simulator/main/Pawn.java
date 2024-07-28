package com.simulator.main;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {

	@Override
	public List<String> getMovements(String position) {
		List<String> movements = new ArrayList<>();
		Character column = position.charAt(0);
		char inputCaseIndependent = Character.toUpperCase(column);
		int currentRow = Character.getNumericValue(position.charAt(1));
		
		if (currentRow < 8) {
			movements.add("" + inputCaseIndependent + (currentRow + 1));
		}else if (currentRow == 8) {
			System.out.println("The Pawn will not be able to move forward as the position, " + position + " , is the end of the Chess board game");
		}
		return movements;
	}

}
