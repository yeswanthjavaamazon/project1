package number_programs;

import java.text.DecimalFormat;

public class IntToString{
	public static void main(String[] args) {
		
		int i = 10;
		
		String s1 = Integer.toString(i);
		System.out.println(s1);
		
		String s2 = String.valueOf(i);
		System.out.println(s2);
		
		String s3 = new Integer(i).toString();
		System.out.println(s3);
		
		String s4 = String.format("%d", i);
		System.out.println(s4);
		
		DecimalFormat obj = new DecimalFormat("#");
		String s5 = obj.format(i);
		System.out.println(s5);
		
		StringBuffer sf = new StringBuffer();
		sf.append(i);
		String s6 = sf.toString();
		System.out.println(s6);
		
		StringBuilder sb = new StringBuilder();
		sb.append(i);
		String s7 = sb.toString();
		System.out.println(s7);
		
		String s8 = i+"";
		System.out.println(s8);
	}
}