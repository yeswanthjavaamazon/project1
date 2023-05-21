package programiz;

import java.util.Scanner;

public class EvenOdd1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = reader.nextInt();
		String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(evenOdd);
	}
}
