package org.mvpigs.bowling;

public class scoreCard {
	
	public scoreCard() {
		
	}

	public static int getSymbolValue(char symbol) {
		String symbols = "-123456789X/";

		int result = symbols.indexOf(symbol);

		if (result > 10) {
			result = 10;
		}
		return result;
	}

}
