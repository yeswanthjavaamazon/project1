package ds;

//Input : str = “0001010111”
//Output : 2
//Minimum number of flips required = 2
//We can flip 2nd bit from 0 to 1 and 9th 
//bit from 1 to 0 to make alternate 
//string “0101010101”.

public class flips {
	
	static int getMinflip(String str, char ch) {
		int flipcount = 0;
		for(int i = 0;i<str.length();i++) {
			
			if(str.charAt(i) != ch) {
				flipcount++;
			}
			
			ch = (ch == '0') ? '1' : '0';
		}
		return flipcount;
	}
	
	public static void main(String[] args) {
		String str = "0001010111";
		
		int count = Math.min(getMinflip(str, '0'), getMinflip(str, '1'));
		System.out.println(count);
	}
}
