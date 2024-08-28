//time complexity:O(n)
//space complexity:O(n)
class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character> stk=new Stack<>();
        int i=0;
        do{
          stk.push(s.charAt(i));
          i++;
          while(stk.size()>=1 && i<s.length()){
            if(s.charAt(i)=='('){
                stk.push('(');
                ans=ans+"(";
                i++;
            }
            else{
                if(stk.size()==1){
                    stk.pop();
                    i++;
                }
                else{
                    stk.pop();
                    ans=ans+")";
                    i++;
                }
            }
          }
        }while(stk.size()==0 && i<s.length());
        return ans;
    }
}
