//stack based approach
//time complexity:O(N)
class Solution {
    public boolean isOpeningBracket(char c){
        if(c=='{'||c=='['||c=='('){
            return true;
        }
        else{
            return false;
        }
    }
    public char pairingBracket(char c){
        if(c==')'){
            return '(';
        }
        else if(c=='}'){
            return '{';
        }
        else{
            return '[';
        }
        
    }
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(isOpeningBracket(s.charAt(i))){
                stk.push(s.charAt(i));
            }
            else{
                char c=s.charAt(i);
                if(stk.isEmpty()){
                    return false;
                }
                else{
                    if(stk.peek()==pairingBracket(c)){
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }
}
