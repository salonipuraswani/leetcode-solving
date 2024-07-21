// https://leetcode.com/problems/vowels-game-in-a-string/
//time complexity:O(N)
//space complexity:O(1)
//logic:if there are 0 vowels the bob wins,otherwise in every case alice wins
class Solution {
    public int countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
              count++;  
            }
        }
        return count;
    }
    public boolean doesAliceWin(String s) {
        //alice:odd
        //bob:even
        if(countVowels(s)==0){
            return false;
        }
        else{
            return true;
        }
    }
}
