//brute force
//time complexity- O(n^3)
class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long sum=0;
        long range=0;
        long min=nums[0];
        long max=nums[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                range=0;
             max=nums[j];
             min=nums[j];
                for(int k=i;k<j;k++){
                    if(nums[k]<min){
                    min=nums[k];
                    }
                if(nums[k]>max){
                    max=nums[k];
                  }
                }
                range=max-min;
            sum=sum+range;
            }
            
        }
        return sum;
    }
}


//optimised-time complexity:O(n^2)
class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long sum=0;
        long range=0;
        long min=nums[0];
        long max=nums[0];
        for(int i=0;i<n;i++){
            max=nums[i];
            min=nums[i];
            range=0;
            for(int j=i+1;j<n;j++){
                
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                
                range=max-min;
            sum=sum+range;
            }
            
        }
        return sum;
    }
}
