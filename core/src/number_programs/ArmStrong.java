package number_programs;

public class ArmStrong {
	public static void main(String[] args) {
		int number = 371;
		int rem, sum = 0, temp;
		temp = number;
		while (number > 0) {
			rem = number % 10;
			sum = sum + (rem * rem * rem);
			number = number / 10;
		}
		if (sum == temp)
			System.out.println("ArmStrong");
		else
			System.out.println("Not ArmStrong");
	}
}