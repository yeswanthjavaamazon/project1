package stringTechn;

public class T5 {
	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = new String("abc");
		s2.intern();
		System.out.println(s1 == s2);

	}
}

//It’s a tricky question and output will be false. 
//We know that intern() method will return the String object reference from the string pool, 
//but since we didn’t assigned it back to s2, there is no change in s2 and hence both s1 and s2 are having different reference. 
//If we change the code in line 3 to s2 = s2.intern(); then output will be true.