import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.NumCompare;
import model.NumCompareLogic;

public class TestEqual {
	
	String message = "Hello";
	String message1 = "Hello";
	//int num1 = 10;
	//int num2 = 10;
	
	NumCompareLogic messageCompareLogic = new NumCompareLogic();
	NumCompare messageCompare = new NumCompare();
	//NumCompare num1 = new NumCompare(num1);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageCompareLogic.printMessage(message));
	}
	
	@Test
	public void testMessageNotNull() {
	   assertNotNull(messageCompareLogic.printMessage(message));
	}
}
