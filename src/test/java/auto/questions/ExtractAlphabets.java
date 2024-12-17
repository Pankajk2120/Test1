package auto.questions;

public class ExtractAlphabets {

	public static void main(String[] args) {
		String str = "example string 123!";
		StringBuilder alphabets = new StringBuilder();
		 for (char c : str.toCharArray()){
			if (Character.isLetter(c)) {
	                alphabets.append(c);
	            }
		 }
		 System.out.println("Alphabets: " + alphabets.toString());
	}

}
