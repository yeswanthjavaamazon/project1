package string;

public class StringFormattertOGGLEReverse {
	public static String reverseToggle(String str) {
		String words[] = str.split("\\s");
		String reverseToggle = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			String first = sb.substring(0, 1);
			String afterfirst = sb.substring(1);
			reverseToggle += first.toLowerCase() + afterfirst.toUpperCase() + " ";
		}
		return reverseToggle.trim();
	}

	public static void main(String[] args) {
		System.out.println(StringFormattertOGGLEReverse.reverseToggle("my name is khan"));
		System.out.println(StringFormattertOGGLEReverse.reverseToggle("I am sonoo jaiswal"));
	}
}
//Java Program to reverse tOGGLE each word in String
//We can reverse tOGGLE each word of a string by the help of reverse(), split(), toLowerCase(), toUpperCase() and 
//substring() methods. By the help of split("\\s") method, we can get all words in an array. 
//To get the first character, we can use substring() or charAt() method.
