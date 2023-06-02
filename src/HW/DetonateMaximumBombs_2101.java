package HW;

public class DetonateMaximumBombs_2101 {
    public int maximumDetonation(int[][] bombs) {
        int n=bombs.length;
        boolean[][] ar=new boolean[n][n];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int[] b1=bombs[i];
                int[] b2=bombs[j];
                double dist=(double)(b1[0]-b2[0])*(double)(b1[0]-b2[0]) + (double)(b1[1]-b2[1])*(double)(b1[1]-b2[1]);
                if((double)b1[2]*(double)b1[2]>=dist){
                    ar[i][j]=true;
                }
                if((double)b2[2]*(double)b2[2]>=dist){
                    ar[j][i]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
             max=Math.max(max,dfs(i,new boolean[n],ar));
             if(max==n)return max;
        }
        return max;

    }
    public int dfs(int i,boolean[] visited,boolean[][] ar){
        visited[i]=true;
        int ans=0;
        for(int j=0;j<ar.length;j++){
            if(ar[i][j] && !visited[j]){
                ans+=dfs(j,visited,ar);
            }
        }
        return 1+ans;
    }

    public static void main(String[] args) {

    }
}