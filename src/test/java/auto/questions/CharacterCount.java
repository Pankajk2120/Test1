package auto.questions;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		 String str = "example  string";
		 HashMap<Character, Integer> charCount = new HashMap<>();
		 for (char c : str.toCharArray()) {
			 charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		 }
		 
		 for (char key : charCount.keySet()) {
	            System.out.println(key + ": " + charCount.get(key));
	        }
	}

}
