package number_programs;

public class Palindrome_Number {
	public static void main(String args[]) {
		int number = 353;// It is the number variable to be checked for palindrome
		int rem, rev = 0, temp;

		temp = number;
		while (number > 0) {
			rem = number % 10; // getting remainder
			rev = (rev * 10) + rem;
			number = number / 10;
		}
		if (temp == rev)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}
