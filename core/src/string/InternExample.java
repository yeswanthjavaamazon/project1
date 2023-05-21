package string;

public class InternExample {
	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = new String("Hi");
		System.out.println(s1 == s2); // FALSE
		s2.intern();
		System.out.println(s1 == s2); // FALSE
		s2 = s2.intern();
		System.out.println(s1 == s2); // TRUE
	}
}
