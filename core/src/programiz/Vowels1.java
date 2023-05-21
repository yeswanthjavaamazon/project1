package programiz;

public class Vowels1 {
	public static void main(String[] args) {
		char ch = 'z';
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Constant");
		}
	}
}
