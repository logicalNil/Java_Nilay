package Easy;

public class LongestBalancedSubstringofBinaryString_2609 {
    public int findTheLongestBalancedSubstring(String s) {
        int l = 0;
        String i = "01";
        while(i.length() <= s.length()){
            if(s.contains(i))
                l = i.length();
            i = "0" + i + "1";
        }
        return l;
    }
    public static void main(String[] args) {
        LongestBalancedSubstringofBinaryString_2609 test = new LongestBalancedSubstringofBinaryString_2609();
        String s = "01000111";
        System.out.println(test.findTheLongestBalancedSubstring(s));
    }
}

