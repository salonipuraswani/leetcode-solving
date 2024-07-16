//brute force approach:array based
//time complexity:O(n^2):90ms
//space complexity:O(1)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //brute force approch:array based
        int n=nums.length;
        int nge[]=new int[n];
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<i+n;j++){
                int mod=j%n;
                flag=false;
                if(nums[mod]>nums[i]){
                    nge[i]=nums[mod];
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                nge[i]=-1;
            }
        }
        return nge;
    }
}

//optimal approach:monotonic stack based approach
//time complexity:O(n^2):19ms
//space complexity:O(1)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //brute force approch:array based
        int n=nums.length;
        int nge[]=new int[n];
        Stack<Integer> stk=new Stack<Integer>();
        for(int i=(n*2)-1;i>0;i--){
            int mod=i%n;
            while(!stk.isEmpty() && stk.peek()<=nums[mod]){
                stk.pop();
            }
            if(!stk.isEmpty() && stk.peek()>nums[mod]){
                nge[mod]=stk.peek();
            }
            else{
                nge[mod]=-1;
            }
            stk.push(nums[mod]);
        }
        return nge;
    }
}
