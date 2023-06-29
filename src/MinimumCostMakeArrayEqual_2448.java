import java.util.Arrays;

public class MinimumCostMakeArrayEqual_2448 {
    public long minCost(int[] nums, int[] cost) {
        int l=Integer.MAX_VALUE;
        int r=Integer.MIN_VALUE;
        for(int i:nums){
            l=Math.min(l,i);
            r=Math.max(r,i);
        }
        long ans=0;
        while(l<r){
            int m=l+(r-l)/2;
            long cost1=findcost(nums,cost,m);
            long cost2=findcost(nums,cost,m+1);
            ans=Math.min(cost1,cost2);
            if(cost1<=cost2){
                r=m;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    long findcost(int[] nums, int[] cost, int target) {
    long res = 0;
    for (int i = 0; i < nums.length; ++i)
      res += Math.abs(nums[i] - target) * (long) cost[i];
    return res;
    }

    public static void main(String[] args) {
        MinimumCostMakeArrayEqual_2448 obj=new MinimumCostMakeArrayEqual_2448();
        int nums[]={1,2,3,4,5};
        int cost[]={1,2,3,4,1};
        System.out.println(obj.minCost(nums, cost));
    }
}
