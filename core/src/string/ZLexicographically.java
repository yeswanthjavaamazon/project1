package string;
public class ZLexicographically {
 
// Function to return the smallest String
    static String smallest(String s) {
        int strLength = s.length();
        String resultAns = "";
 
        // iterate the String
        for (int i = 0; i < strLength-1; i++) {
 
            // first point where s[i]>s[i+1]
            if (s.charAt(i) > s.charAt(i + 1)) {
 
                // append the String without
                // i-th character in it
                for (int j = 0; j < strLength; j++) {
                    if (i != j) {
                        resultAns += s.charAt(j);
                    }
                }
                return resultAns;
            }
        }
 
        // leave the last character
        resultAns = s.substring(0, strLength - 1);
        return resultAns;
    }
 
// Driver Code
    public static void main(String[] args) {
 
        String s = "arp";
        System.out.println(smallest(s));
    }
}