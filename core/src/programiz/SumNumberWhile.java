package programiz;

public class SumNumberWhile {
	public static void main(String[] args) {
		int num = 50, i = 1, sum = 0;
		while (i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum = " + sum);
	}
}
