package org.mvpigs.bowling;



import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class scoreCardTest {
	
	@Test
	/*
	 * WHO: The player
	 * WHAT: get us a string with his score
	 * WHY: to obtain his result converted to int
	 */
	public void obtenerValorStringTest() {
		char symbol = '/';
		assertEquals(scoreCard.getSymbolValue(symbol), 10);
		System.out.println(scoreCard.getSymbolValue(symbol));
	}

}
