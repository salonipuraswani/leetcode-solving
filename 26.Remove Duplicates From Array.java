//time complexity:O(n^2)
//space complexity:O(n)
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!(set.contains(nums[i]))){
               arr[j]=nums[i];
               j++;
               set.add(nums[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        return set.size();
    }
}
