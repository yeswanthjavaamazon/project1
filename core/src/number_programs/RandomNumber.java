package number_programs;

import java.util.Random;

public class RandomNumber {
	/*public static void main(String[] args) {
		int min = 1;
		int max = 10;
		Random rn = new Random();
		int range = max-min+1;
		int Number = rn.nextInt(range)+min;
		System.out.println(Number);
	}*/
	
	/*public static void main(String[] args) {
		int min = 1;
		int max = 10;
		
		int range = min+(int)(Math.random()*max);
		System.out.println(range);
	}*/
	
	public static void main(String[] args) {
		Random random = new Random();
		for(int i=1;i<=10;i++){
			int rnumb = random.nextInt(100);
			System.out.println(rnumb);
		}
	}
}
