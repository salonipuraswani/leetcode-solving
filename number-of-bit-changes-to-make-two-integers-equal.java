// https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal/
//Example:

//Input: n = 13, k = 4

//Output: 2

//Explanation:
//Initially, the binary representations of n and k are n = (1101)2 and k = (0100)2.
//We can change the first and fourth bits of n. The resulting integer is n = (0100)2 = k.

//time complexity:O(log(n) + log(k))
//space complexity:O(log(n) + log(k))

class Solution {
    //we can write a method to convert a number from decimal to binary
    public String toBinary(int num){
        String s="";
        Stack<Integer> stk=new Stack<>();
        while(num>0){
            stk.push(num%2);
            num=num/2;
        }
        while(!stk.isEmpty()){
          char c=(char)(stk.pop()+'0');
          String str=""+c;
          s=s+str;
        }
        return s;
    }
    public int minChanges(int n, int k) {
        String bn=toBinary(n);
        String bk=toBinary(k);
        int count=0;
        if(bn.length()>bk.length()){
            int diff=bn.length()-bk.length();
            String backup=bk;
            bk="";
            for(int i=0;i<diff;i++){
                bk=bk+'0';
            }
            for(int i=diff;i<bn.length();i++){
                bk=bk+backup.charAt(i-diff);
            }
        }
        if(bk.length()>bn.length()){
            int diff=bk.length()-bn.length();
            String backup=bn;
            bn="";
            for(int i=0;i<diff;i++){
                bn=bn+'0';
            }
            for(int i=diff;i<bn.length();i++){
                bn=bn+backup.charAt(i-diff);
            }
        }
        for(int i=0;i<bn.length();i++){
            if(bn.charAt(i)!=bk.charAt(i)){
                 if(bn.charAt(i)=='1'){
                    count++;
                 }
                 else{
                    return -1;
                 }
            }
        }
        return count;
    }
}
