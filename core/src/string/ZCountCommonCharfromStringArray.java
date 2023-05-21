package string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZCountCommonCharfromStringArray {
	
    public static void main(String[] args) {        
        ZCountCommonCharfromStringArray main = new ZCountCommonCharfromStringArray();
        List<String> result = main.commonChars(new String[] {"abc", "dbc", "acb"});     
        System.out.println(result.size());                 
    }
	
	public List<String> commonChars(String[] A) {        
        int[] array = new int[26];
        int[] main = new int[26];
        Arrays.fill(main,Integer.MAX_VALUE);
         
        char[] temp;        
        for(String str : A){
            temp = str.toCharArray();
            for(int i=0; i<temp.length; i++){
                array[temp[i] - 'a']++;
            }
            for(int i = 0; i<26; i++){
                main[i] = Math.min(main[i], array[i]);
                array[i] = 0;
            }
        }
         
        List<String> result = new ArrayList<>();
        for(int i=0; i<26; i++) {
            while((main[i]--) > 0) {
                result.add((((char)('a' + i))+""));
            }
        }
        return result;        
    }
}