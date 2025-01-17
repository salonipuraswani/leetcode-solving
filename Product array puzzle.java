//gfg link
//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
//time complexity:O(n)
//space complexity:O(n)
class Solution {
    
    public static int[] productExceptSelf(int arr[]) {
        int n=arr.length;
        int product=1;
         int countZero=0;
         
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                countZero++;
            }
            else{
             product=product*arr[i];   
            }
        }
        int res[]=new int[n];
        if(countZero>=2){
            Arrays.fill(res,0);
        }
        else{
          for(int i=0;i<n;i++){
            if(arr[i]==0){
                res[i]=product;
            }
            else{
                if(countZero==1){
                    res[i]=0;
                }
                else{
             res[i]=product/arr[i];       
                }
                
            }
        }  
        }
        
        return res;
    }
}
