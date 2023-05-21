package string;

public class StringSort_WithOutAPI {
	public static void main(String[] args) {
		String str = "cab";
		char[] ch = str.toCharArray();
		char temp = 0;
		
		for(int i = 0;i<ch.length;i++){
			for(int j = 0;j<ch.length;j++){
				if(ch[j] > ch[i]){
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}			
		}
		for(int l = 0;l<ch.length;l++){
			System.out.print(ch[l]);
		}
	}
}
