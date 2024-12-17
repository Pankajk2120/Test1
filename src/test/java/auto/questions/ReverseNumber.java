package auto.questions;

public class ReverseNumber {

	public static void main(String[] args) {
		int Number = 112233;
		int Reverse = 0;
		
		while(Number != 0) {
			int digit = Number % 10; //last digit
			Reverse = Reverse*10 + digit; // Append the digit to the reversed number
			Number = Number/10; // Remove the last digit from the original number
		}
		System.out.println("Reversed Number: " + Reverse);
	}

}
