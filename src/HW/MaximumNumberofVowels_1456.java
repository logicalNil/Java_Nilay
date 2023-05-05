package HW;


//Maximum Number of Vowels in a Substring of Given Length
public class MaximumNumberofVowels_1456 {
    public int maxVowels(String s, int k) {
        int v = 0, count = 0;
        for(int i = 0; i < k; i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        if(count > v)
            v = count;
        for(int i = k, j = 0; i < s.length(); i++,j++){
            char c = s.charAt(i);
            char ch = s.charAt(j);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count--;
            if(count >= k)
                return k;
            if(count > v)
                v = count;
        }
        return v;
    }

    public static void main(String[] args) {
        MaximumNumberofVowels_1456 obj = new MaximumNumberofVowels_1456();
        System.out.println(obj.maxVowels("abciiidef",3));
    }
}
