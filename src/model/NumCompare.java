package model;

public class NumCompare {
	
	int evenNum;
	int oddNum;
	int primeNum;
	int num1;
	int num2;
	String message;
	String message1;
	
	public NumCompare() { 
		
	}
	
	public NumCompare(String message) {
		this.message = message;
	}
	
	public NumCompare(String message, String message1) {
		super();
		this.message = message;
		this.message1 = message1;
	}
	
	
	public NumCompare(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public NumCompare(int evenNum, int oddNum, int primeNum) {
		this.evenNum = evenNum;
		this.oddNum = oddNum;
		this.primeNum = primeNum;
	}
	
	public int getEvenNum() {
		return evenNum;
	}
	public void setEvenNum(int evenNum) {
		this.evenNum = evenNum;
	}
	public int getOddNum() {
		return oddNum;
	}
	public void setOddNum(int oddNum) {
		this.oddNum = oddNum;
	}
	public int getPrimeNum() {
		return primeNum;
	}
	public void setPrimeNum(int primeNum) {
		this.primeNum = primeNum;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message1 = message;
	}
	
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}
