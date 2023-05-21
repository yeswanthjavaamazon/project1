package string;

public class ReverseStringRecursive {	
	public static void main(String[] args) {
		ReverseStringRecursive r = new ReverseStringRecursive();
				System.out.println(r.revStr("JAV"));
	}
	public String revStr(String str){
		String reverse ="";
		if(str.length() == 1){
			return str;
		} else {
			reverse = reverse + str.charAt(str.length()-1)+revStr(str.substring(0, str.length()-1));
			return reverse;
		}
	}
}
