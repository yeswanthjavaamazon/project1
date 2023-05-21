package string;

public class StringVowel {
	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println(s);
		String ss = s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(ss);
	}
}
