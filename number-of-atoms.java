class Solution {
    public boolean samePairity(char i,char j){
        int a=Character.getNumericValue(i);
        int b=Character.getNumericValue(j);
        if(a%2==0 && b%2==0){
            return true;
        }
        else if(a%2!=0 && b%2!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public String swap(String s,int i){
        String buffer="";
        buffer=buffer+s.charAt(i+1)+s.charAt(i);
        String result = "";
        for(int j=0;j<i;j++){
         result=result+s.charAt(j);
        }
        result=result+buffer;
        if((i+2)<s.length()){
        for(int j=i+2;j<s.length();j++){
          result=result+s.charAt(j);
        }
        }
       return result;
        
    }
    public String getSmallestString(String s) {
        //String s2="";
        for(int i=0;i<s.length()-1;i++){
            if(samePairity(s.charAt(i),s.charAt(i+1))){
                if(s.charAt(i)>s.charAt(i+1)){
                    
                   return swap(s,i);
                   
                }
            }

        }
        return s;
    }
}
