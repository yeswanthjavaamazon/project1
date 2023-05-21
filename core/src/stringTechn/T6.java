package stringTechn;

public class T6 {
	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Hello");

	}
}
//How many String objects got created in below code snippet?
//The answer is 3.
//First – line 1, “Hello” object in the string pool.
//Second – line 1, new String with value “Hello” in the heap memory.
//Third – line 2, new String with value “Hello” in the heap memory. Here “Hello” string from string pool is reused.
