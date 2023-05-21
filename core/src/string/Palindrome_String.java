package string;

public class Palindrome_String {
	public static void main(String[] args) {
		String str = "Madam";
		String temp = str;
		String revStr = "";
		
		for(int i = str.length()-1;i>=0;i--){
			revStr = revStr + str.charAt(i);
		}
		
		if(temp.equalsIgnoreCase(revStr)){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}