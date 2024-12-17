package Java_Basic;

import java.util.Scanner;

public class EvenOdd_Numbers {

	public static void main(String[] args) {
		int Number = 10;
		for(int i=0; i<=Number; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------<<FirstNEvenNumbers>>------");
		FirstNEvenNumbers();
		System.out.println("------<<FirstNOddNumbers>>------");
		FirstNOddNumbers();
		System.out.println("------<<EvenOddNumbers>>------");
		EvenOddNumbers();
	}
	
	public static void FirstNEvenNumbers () {
		for(int i = 0; i<10 ; i++) {
			System.out.println(i * 2);
		}
	}
	
	public static void FirstNOddNumbers () {
		for(int i = 0; i<10 ; i++) {
			System.out.println(2*i+1);
		}
	}
	
	
	public static void EvenOddNumbers () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Given Number is Even Number : " +number);
		}else{
			System.out.println("Given Number is Odd Number : " +number);
		}
		
	}

}
