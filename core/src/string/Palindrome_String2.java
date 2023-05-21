package string;

public class Palindrome_String2 {
	public static void main(String[] args) {
		String str = "Madam";
		String temp = str;
		
		for(int i = str.length()-1;i>=0;i--) {
			str = str + str.charAt(i);
		}
		
		String output = str.substring(str.length()/2, str.length());
		
		if(temp.equalsIgnoreCase(output)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}