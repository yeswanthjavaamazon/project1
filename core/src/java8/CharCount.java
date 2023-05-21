package java8;

public class CharCount {
	public static void main(String[] args) {
		long count = "hello".chars().filter(ch -> (char)ch == 'l').count();
		System.out.println(count);
	}
}
