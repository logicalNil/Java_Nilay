package HW;

public class OptimalPartitionString_2405 {
    public int partitionString(String s) {
        int[] alpha = new int[26];
        int res=1;
        for(int i=0; i<s.length();i++){
        	if(alpha[s.charAt(i)-'a']+1>1){
        		res++;
        		alpha = new int[26];
        	}
        	alpha[s.charAt(i)-'a']++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        OptimalPartitionString_2405 ops = new OptimalPartitionString_2405();
        System.out.println(ops.partitionString(s));
    }
}
