//link: https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/
//optimal approach remaining
//brute force approach:
//time complexity:O(N^2)
//space complexity:O(N)
class Solution {
    public int search10(char[] s){
        int count=0;
        for(int i=0;i<s.length-1;i++){
           if(s[i]=='1' && s[i+1]=='0'){
            count++;
           }
        }
        return count;
    }
    public int maxOperations(String s) {
        char c[]=new char[s.length()];
        int counter=0;
        for(int i=0;i<s.length();i++){
          c[i]=s.charAt(i);
        }
        int count=search10(c);
        if(count==0){
            return count;
        }
        else{
            
            while(search10(c)!=0){
              for(int i=0;i<c.length-1;i++){
           if(c[i]=='1' && c[i+1]=='0'){
            c[i]='0';
            c[i+1]='1';
            if(i+2<c.length && c[i+2]=='0'){
               
            }
            else{
                counter++;
            }
           }
        }
            }
        }
        return counter;
    }
}
