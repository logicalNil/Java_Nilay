import java.util.Arrays;

public class MinimumCostMakeArrayEqual_2448 {
    public long minCost(int[] nums, int[] cost) {
        int n=nums.length;
        //storing pref sum of cost after it sorted wrt to nums
        long pref[]=new long[n];
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=cost[i];
        }
        Arrays.sort(arr,(a, b)->a[0]-b[0]);
        pref[0]=arr[0][1];
        // index of median
        for(int i=1;i<n;i++){
            pref[i]+=pref[i-1]+arr[i][1];
        }
        int p=0;
        //calculating median
        long med=pref[n-1]/2;
        for(int i=0;i<n;i++){
            if(pref[i]>med){
                p=i;
                break;
            }
        }
        long get=arr[p][0];long sum=0;
        //substracting and calculating median
        for(int i=0;i<n;i++){
            sum+=1l*Math.abs(arr[i][0]-get)*arr[i][1]*1l;
        }
        return sum;
    }

    public static void main(String[] args) {
        MinimumCostMakeArrayEqual_2448 obj=new MinimumCostMakeArrayEqual_2448();
        int nums[]={1,2,3,4,5};
        int cost[]={1,2,3,4,1};
        System.out.println(obj.minCost(nums, cost));
    }
}
