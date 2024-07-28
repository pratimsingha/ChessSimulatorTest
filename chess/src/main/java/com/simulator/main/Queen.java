package com.simulator.main;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Queen implements Piece {

	@Override
	public List<String> getMovements(String position) {
		Set<String> distinctMovements = new HashSet<>();
		Character column= position.charAt(0);
		char inputCaseIndependent = Character.toUpperCase(column);
		int currentRow = Character.getNumericValue(position.charAt(1));
		String columns = "ABCDEFGH";
		
		int i = currentRow;
		int j = 0;
		while(i > 1) {  
			i--;
			j++;
			distinctMovements.add("" + inputCaseIndependent + i); //Vertical down direction
			char decrementCharacter = (char) (inputCaseIndependent - j);
			if (columns.indexOf(decrementCharacter) >= 0) {
				distinctMovements.add("" + decrementCharacter + i); //left down diagonal direction
				distinctMovements.add("" + decrementCharacter + currentRow); //left horizontal direction
			}
			char incrementCharacter = (char) (inputCaseIndependent + j);
			if (columns.indexOf(incrementCharacter) >= 0) {
				distinctMovements.add("" + incrementCharacter + i); //right down diagonal direction
				distinctMovements.add("" + incrementCharacter + currentRow); //right horizontal direction
			}
			
		}
		i = currentRow;
		j = 0;
		while(i <= 7) {
			i++;
			j++;
			distinctMovements.add("" + inputCaseIndependent + i); //vertical up direction
			char decrementCharacter = (char) (inputCaseIndependent - j);
			if (columns.indexOf(decrementCharacter) >= 0) {
				distinctMovements.add("" + decrementCharacter + i); //left up diagonal direction
				distinctMovements.add("" + decrementCharacter + currentRow); //left horizontal direction
			}
			char incrementCharacter = (char) (inputCaseIndependent + j);
			if (columns.indexOf(incrementCharacter) >= 0) {
				distinctMovements.add("" + incrementCharacter + i); //right up diagonal direction
				distinctMovements.add("" + incrementCharacter + currentRow); //right horizontal direction
			}
			
		}
		
		List<String> movements = distinctMovements.stream().collect(Collectors.toList());	//converts it to a mutable list as it needs to be sorted before it gets displayed
		Collections.sort(movements);
		return movements;
	}

}
