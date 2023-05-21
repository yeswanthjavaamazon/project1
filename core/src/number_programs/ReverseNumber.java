package number_programs;

class ReverseNumber {
	public static void main(String[] args) {
		int n = 12345, rev = 0, remainder;
		System.out.println("enter an integer: ");
		while (n != 0) {
			remainder = n % 10;
			rev = rev * 10 + remainder;
			n /= 10;
		}
		System.out.println(rev);
//		System.out.println("reversed number is", +rev);
	}
}
