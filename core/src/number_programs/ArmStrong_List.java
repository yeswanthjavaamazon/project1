package number_programs;

public class ArmStrong_List {
	public static void main(String[] args) {
		int limit = 500;
		int rem, sum = 0, number;
		System.out.println("#Printing ArmStorng Number from 0 to " + limit + " >>>");
		for (int i = 0; i <= limit; i++) {
			number = i;
			while (number > 0) {
				rem = number % 10;
				sum = sum + (rem * rem * rem);
				number = number / 10;
			}
			if (sum == i) {
				System.out.print(i + ", ");
			}
			sum = 0;
		}
	}
}