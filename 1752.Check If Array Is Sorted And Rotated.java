//time complexity:O(n^2)
//space complexity:O(n)
class Solution {
    public boolean isSorted(int[] arr){
        boolean ans=true;
        for(int i=0;i<arr.length-1;i++){
              if(arr[i]>arr[i+1]){
                ans=false;
                i=arr.length-1;
              }
        }
        return ans;
    }
    public boolean check(int[] nums) {
        boolean ans=false;
        int rotations=0;
        do{
         if(!isSorted(nums)){
            rotations++;
            int arr[]=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                arr[i]=nums[(i+1)%nums.length];
            }
            nums=arr;
         }
         if(isSorted(nums)){
            ans=true;
            break;
         }
        }while(rotations<nums.length);
        return ans;
    }
}
