//Brute Force Approach:array
//Time complexity:O(len1*len2)
//space complexity:O(len1)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(nums1[i]==nums2[j]){
                    boolean flag=false;
                    for(int k=j+1;k<len2;k++){
                        flag=false;
                        if(nums2[k]>nums2[j]){
                        list.add(nums2[k]);
                        flag=true;
                        break;
                        }
                    }
                    if(flag==false){
                        list.add(-1);
                    }
                    break;
                }
            }
        }
        int[] ans=new int[len1];
        for(int i=0;i<len1;i++){
          ans[i]=list.get(i);
        }
        return ans;
    }
}

//optimal approach:stack
//overall time complexity:O(len1*len2)
//time complexity to find nge array:O(len2)
//space complexity:O(len2)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //optimal approach:stack
        int len1=nums1.length;
        int len2=nums2.length;
        int nge[]=new int[len2];
        int ans[]=new int[len1];
        Stack<Integer> stk=new Stack<Integer>();
       for(int i=len2-1;i>=0;i--){
        while(!stk.isEmpty() && stk.peek()<=nums2[i]){
            stk.pop();
        }
        if(!stk.isEmpty() && stk.peek()>nums2[i]){
            nge[i]=stk.peek();
        }
        else{
            nge[i]=-1;
        }
        stk.push(nums2[i]);
       }
       //obtaining ans from nge
       for(int i=0;i<len1;i++){
         for(int j=0;j<len2;j++){
            if(nums1[i]==nums2[j]){
                ans[i]=nge[j];
                break;
            }
         }
       }
       return ans;
    }
}
