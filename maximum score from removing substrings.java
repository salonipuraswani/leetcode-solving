//brute force
//time complexity:O(n^2)
//space complexity:O(1)
class Solution {
    public int maximumGain(String s, int x, int y) {
      //brute force
        int score=0;
        String str="";
        String priority="";
        String nonpriority="";
        if(x>y){
             priority="ab";
            
             nonpriority="ba";
        }
        else if(y>=x){
             priority="ba";
             nonpriority="ab";
        }
        while(s.contains(priority)){
      for(int i=0;i<s.length()-1;i++){

            str=s.substring(i,i+2);
            if(str.compareTo(priority)==0){
                if(priority.compareTo("ab")==0){
                    score=score+x;
                    s=s.substring(0,i)+s.substring(i+2,s.length());
                }
                else{
                    score=score+y;
                    s=s.substring(0,i)+s.substring(i+2,s.length());
                }
            }
        }
        }
        while(s.contains(nonpriority)){
      for(int i=0;i<s.length()-1;i++){
            str=s.substring(i,i+2);
            if(str.compareTo(nonpriority)==0){
                if(nonpriority.compareTo("ab")==0){
                    score=score+x;
                    s=s.substring(0,i)+s.substring(i+2,s.length());
                }
                else{
                    score=score+y;
                    s=s.substring(0,i)+s.substring(i+2,s.length());
                }
            }
        }
        }
        return score;
        

    }
}

//optimal solution:using stack
//time complexity:O(n)
//space complexity:O(n)
class Solution {
    public int maximumGain(String s, int x, int y) {
        //optimal solution
        //using stack
        Stack<Character> stk=new Stack<>();
        String priority="";
        String nonpriority="";
        int score=0;
        int score1=0;
        int score2=0;
       if(x>y){
        priority="ab";
        nonpriority="ba";
        score1=x;
        score2=y;
       }
       else{
        priority="ba";
        nonpriority="ab";
        score1=y;
        score2=x;
       }
    
    //1.phase 1=priority
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==priority.charAt(1)){
            if(!stk.isEmpty() && stk.peek()==priority.charAt(0)){
                stk.pop();
                score=score+score1;
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        else{
                stk.push(s.charAt(i));
            }
    }
    //2.phase 2=nonpriority
    Stack<Character> stk2=new Stack<>();
    while(!stk.isEmpty()){
        stk2.push(stk.pop());
    }
        String s2="";
    while(!stk2.isEmpty()){
         s2=s2+stk2.pop();
    }
    System.out.println(s2);
    for(int i=0;i<s2.length();i++){
        if(s2.charAt(i)==nonpriority.charAt(1)){
            if(!stk2.isEmpty() && stk2.peek()==nonpriority.charAt(0)){
                stk2.pop();
                score=score+score2;
            }
            else{
                stk2.push(s2.charAt(i));
            }
        }
        else{
                stk2.push(s2.charAt(i));
            }
    }
    return score;
    }

}
