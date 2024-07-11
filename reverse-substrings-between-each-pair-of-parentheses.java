class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                String buffer="";
                while(stk.peek()!='('){
                    buffer=buffer+stk.pop();
                }
                stk.pop();
                for(int j=0;j<buffer.length();j++){
                    stk.push(buffer.charAt(j));
                }
            }
            else{
                  stk.push(s.charAt(i));
            }
            
        }
        String reverse="";
         Stack<Character> stk2=new Stack<>();
        while(!stk.isEmpty()){
             stk2.push(stk.pop());
        }
        while(!stk2.isEmpty()){
             reverse=reverse+stk2.pop();
        }
        return reverse;
    }
}
//time complexity:O(n)
//space complexity:O(n)
//approach: stack 
//algorithm: push the characters of string into stack till you get '('.once you get ( pop the characters till ( and store into string.push the string back into stack.continue till end of string.Pop the stack and store into string.reverse this string.
