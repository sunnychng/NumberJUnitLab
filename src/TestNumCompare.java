import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.NumCompare;
import model.NumCompareLogic;

public class TestNumCompare {
	
	NumCompareLogic numEvenTemp = new NumCompareLogic();
	NumCompare numEven = new NumCompare();
	
	NumCompareLogic numPrimeTemp = new NumCompareLogic();
	NumCompare numPrime = new NumCompare();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void evenNumberTestTrue(){
		numEven.setEvenNum(4);
        assertTrue(numEvenTemp.isEvenNumber(numEven));
    }
	
	@Test
	public void evenNumberTestFalse(){
		numEven.setEvenNum(3);
        assertFalse(numEvenTemp.isEvenNumber(numEven));
    }
	
	@Test
	public void primeNumberTest(){
		numPrime.setPrimeNum(17);
        assertTrue(numPrimeTemp.isPrime(numPrime));
    }
}