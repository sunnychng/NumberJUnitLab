package model;

public class NumCompareLogic {

	public boolean isEvenNumber(NumCompare number){
        
        boolean result = false;
        if(number.getEvenNum() %2 == 0){
            result = true;
        }
        return result;
    }
	
	public boolean isOddNumber(NumCompare number){
        
        boolean result = false;
        if(number.getOddNum() %2 == 1){
            result = true;
        }
        return result;
    }
	
	public boolean isPrime(NumCompare number) {
		boolean prime = true;
		for (int i = 2; i < number.getPrimeNum(); i++) {
			int temp = number.getPrimeNum() % i;
			if (temp == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	// prints the message
	public String printMessage(String message) {
		System.out.println(message);
		return message;
	}
	
	// compare the String message
	public boolean compareMessage(String message, String message1) {
			
		if (message.equals(message1)){
			System.out.println(message + " and " + message1 + " are equal.");
		}
		return false; 
	}
	
	public boolean compareNumber(NumCompare num1, NumCompare num2) {
		
		if (num1 == num2){
			System.out.println(num1 + " and " + num2 + " are equal.");
		} else {
			System.out.println(num1 + " and " + num2 + " are not equal.");
		}
		return false; 
	}
}
