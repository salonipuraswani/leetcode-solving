//rotate the array to right by k positions
class Solution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a=i-k;
            while(a<0){
                a=nums.length+a;
            }
            arr[i]=nums[(a%nums.length)];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}
