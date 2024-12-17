package auto.questions;

public class ExtractLetter {

	public static void main(String[] args) {
		String str = "12AsdFeA3451fdsv";
		String Result = str.replaceAll("[0-9]", "");
		System.out.println("String without numbers: "+Result);
	}
}
