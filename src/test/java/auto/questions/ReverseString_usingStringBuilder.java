package auto.questions;

public class ReverseString_usingStringBuilder {

	public static void main(String[] args) {
		String str = "Hello World!";
		String reversed = "";
		StringBuilder sb = new StringBuilder(str);
		reversed = sb.reverse().toString();
		System.out.println("Reversed : "+reversed);
	}
}
