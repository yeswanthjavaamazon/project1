package string;

public class ReplaceCharInString {
	public static void main(String[] args) {
		String str = "Ahoo";
		System.out.println(str);
		System.out.println(removeChar(str, 'o'));
		System.out.println(str);
	}
	
    private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c), "");
    }
}
