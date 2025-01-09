//link
//https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
//time complexity:o(n);n is size of array words
//space complexity:O(1)
//solution:
class Solution {
    public boolean isPrefix(String str1,String str2){
        if(str1.startsWith(str2)){
            return true;
        }
        return false;
    }
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(isPrefix(words[i],pref)){
                count++;
            }
        }
        return count;
    }
}
