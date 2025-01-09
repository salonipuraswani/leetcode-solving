//link
//https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/
//solution:2 pointers approach
class Solution {
    public boolean isPrefixAndSuffix(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        boolean result=false;
        String s="";
        if(n2>=n1){
            result=true;
            for(int i=0;i<n1;i++){
              s=s+str2.charAt(i);
            }
            if(s.compareTo(str1)!=0){
                result=false;
            }
            s="";
            for(int i=n2-n1;i<n2;i++){
                s=s+str2.charAt(i);
            }
            if(s.compareTo(str1)!=0){
                result=false;
            }
            
        }
        return result;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        int n=words.length;
        //2 pointers approach
        int left=0;
        int right=1;
        while(left<n-1){
            while(right<n){
                if(isPrefixAndSuffix(words[left],words[right])){
                    count++;
                }
                right++;
            }
            left++;
            right=left+1;
        }
        return count;
    }
}
