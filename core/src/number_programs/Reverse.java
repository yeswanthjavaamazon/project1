package number_programs;

public class Reverse {
	
	public static void main(String[] args) {
		Reverse rNumbers = new Reverse();
		System.out.println("Result : "+rNumbers.reverseNumber(199));
	}
	
	public int reverseNumber(int number) {
		int reverse = 0;
		while(number != 0) {
			reverse = (reverse*10)+(number%10);
			number = number/10;
		}
		return reverse;
	}
}
