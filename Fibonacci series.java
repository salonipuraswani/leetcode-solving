//brute force:recursion
class Solution{
  public static void main(String[] args) {
       int n=5;
       System.out.println(fibo(n));
    }
    static int fibo(int n){
             if(n<=1){
                return n;
            }
            else{
                return fibo(n-1)+fibo(n-2);
            }
    }
}
//optimal:recursion with memoisation(dynamic programming)
//Memoisation:means after each function call,the value that it has returned is stored in an array,so that whenever its called again,the system does not have to recalculate it again with multiple function calls.It uses the value which is already stored in the array.
class Solution {
    public static void main(String[] args) {
       int n=5;
       int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
       System.out.println(fibo(n,dp));
    }
    static int fibo(int n,int[] dp){
        //fibonacii with recursion,with memoisation
            if(dp[n]!=-1){
                return dp[n];
            }
            else if(n<=1){
                dp[n]=n;
                return n;
            }
            else{
                dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
                return dp[n];
            }
    }
}
