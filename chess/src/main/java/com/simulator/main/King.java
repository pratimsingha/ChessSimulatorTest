package com.simulator.main;

import java.util.ArrayList;
import java.util.List;

public class King implements Piece {

	@Override
	public List<String> getMovements(String position) {
		List<String> movements = new ArrayList<>();
		Character column = position.charAt(0);
		char inputCaseIndependent = Character.toUpperCase(column);
		int currentRow = Character.getNumericValue(position.charAt(1));
		String columns = "ABCDEFGH";
		
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				char possibleColumn = (char) (inputCaseIndependent + i);
				int row = currentRow + j;
				
				if (columns.indexOf(possibleColumn) >= 0 && row >= 1 && row <= 8)
					movements.add("" + possibleColumn + row);
			}
		}
		return movements;
	}

}
