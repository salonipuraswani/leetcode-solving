//brute force
class Solution
{
    public int countDistinct(String s){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
    long substrCount (String S, int K) {
        // your code here
        String a="";
        long count=0;
        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length();j++){
                a="";
                for(int k=i;k<=j;k++){
                   a=a+S.charAt(k);
                }
                if(countDistinct(a)==K){
                    count++;
                }
            }
        }
        return count;
    }
}
