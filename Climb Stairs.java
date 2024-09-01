class Solution {
    
    public int climbStairs(int n) {
        int dp[]=new int[n+2];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return climb(n+1,dp);
        
    }

     public int climb(int n,int[] dp) {
        //n is number of stairs
        //return number of ways to climb the stairs
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n<=1){
            dp[n]=n;
            return n;
        }
        else{
            dp[n]=climb(n-1,dp)+climb(n-2,dp);
            return dp[n];
        }
        
    }
}
