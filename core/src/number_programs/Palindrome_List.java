package number_programs;

public class Palindrome_List {
	public static void main(String[] args) {
		int limit = 131;
		System.out.print("Palindrome numbers : ");
		int rem, rev = 0, number;
		for (int i = 1; i <= limit; i++) {
			number = i;
			while (number > 0) {
				rem = number % 10;
				rev = (rev * 10) + rem;
				number = number / 10;
			}
			if (rev == i)
				System.out.print(i + ", ");
			rev = 0;
		}
	}
}
