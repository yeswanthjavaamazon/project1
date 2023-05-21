package string;

public class DuplicateStringCharacterCount {
	public static void main(String[] args) {
		String str = "JavaInterview";
		
		String findStr = "e";
		int lastIndex = 0;
		int count = 0;
		
		while(lastIndex!=-1){
			lastIndex = str.indexOf(findStr, lastIndex);
			
			if(lastIndex!=-1){
				count++;
				lastIndex = lastIndex+findStr.length();
//				lastIndex++;	// this will also work in the replace of above line
			}
		}
		System.out.println(count);
	}
}
