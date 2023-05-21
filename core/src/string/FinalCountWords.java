package string;

import java.util.HashMap;

public class FinalCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This this is is done by yeswanth yeswanth";
		String[] split = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				map.put(split[i], map.get(split[i]) + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}

/*
 * class CountTheWords { public static void main(String[] args) {
 * System.out.println("Enter the string");
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * String s=sc.nextLine();
 * 
 * String[] words = s.trim().split(" ");
 * 
 * System.out.println("Number of words in the string = "+words.length); } }
 */
