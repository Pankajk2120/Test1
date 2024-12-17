package auto.questions;

public class ExtractDigits {

	public static void main(String[] args) {
		 String input = "Abc123";
		 String digits = input.replaceAll("\\D", "");
		 System.out.println("Extracted Digits: " + digits);
	}

}
