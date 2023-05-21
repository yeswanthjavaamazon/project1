package string;

public class StringFormattertOGGLE {
	public static String toggle(String str) {
		String words[] = str.split("\\s");
		String toggle = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			toggle += first.toLowerCase() + afterfirst.toUpperCase() + " ";
		}
		return toggle.trim();
	}

	public static void main(String[] args) {
		System.out.println(StringFormattertOGGLE.toggle("my name is khan"));
		System.out.println(StringFormattertOGGLE.toggle("I am sonoo jaiswal"));
	}
}
//Java Program to tOGGLE each word in String
//We can tOGGLE each word of a string by the help of split(), toLowerCase(), toUpperCase() and substring() methods. 
//By the help of split("\\s") method, we can get all words in an array. To get the first character, 
//we can use substring() or charAt() method.