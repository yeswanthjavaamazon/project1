package programiz;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = reader.nextInt();
		if(num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
