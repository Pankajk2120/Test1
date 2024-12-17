package auto.questions;

public class ExtractCapitalSmall {

	public static void main(String[] args) {
		String Str = "ABCabc12AbcABC321";
		String Result = Str.replaceAll("[0-9a-z]", "");
		System.out.println("Removed the small letter and Number from the given String : "+Result);
	}

}
