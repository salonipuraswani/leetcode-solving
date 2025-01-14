//gfg potd
//link
//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
//time complexity:O(n)
//space complexity:O(1)
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int sumLeft=0;
        int sumRight=sum;
       for(int i=0;i<n;i++){
           if(i>0){
               sumLeft=sumLeft+arr[i-1];
           }
           sumRight=sumRight-arr[i];
           if(sumLeft==sumRight){
               return i;
           }
       }
       return -1;
    }
}
