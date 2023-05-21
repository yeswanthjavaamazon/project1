package string;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str= "Java Interview";
		System.out.println(str);
		str = str.replaceAll("\\s+", "");
		System.out.println(str);
		removeWhiteSpace("Java Interview");
	}
	
	private static void removeWhiteSpace(String str) {
		char[] ch = str.toCharArray();
		String withoutspace = "";
		for(int i= 0;i<ch.length;i++) {
			if((ch[i]!=' ')&&(ch[i] != '\t')) {
				withoutspace += ch[i];
			}
		}
		System.out.println(withoutspace);
	}
}
