 package string;

public class ReverseString {
	/*public static void main(String[] args) {
		String str = "Hello Yeswanth Hello";
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(revString);
	}*/
	public static void main(String[] args) {
		String s = "Madam";
		System.out.println(s);
		for (int i = s.length() - 1; i >= 0; i--) {
			s = s + s.charAt(i);
		}
		s = s.substring(s.length() / 2, s.length());
		System.out.println(s);
	}
}
