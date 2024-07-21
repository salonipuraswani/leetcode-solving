// https://leetcode.com/problems/minimum-length-of-string-after-operations/
// Example:

// Input: s = "abaacbcbb"

// Output: 5

// Explanation:
// We do the following operations:

// Choose index 2, then remove the characters at indices 0 and 3. The resulting string is s = "bacbcbb".
// Choose index 3, then remove the characters at indices 0 and 5. The resulting string is s = "acbcb".

//time complexity:O(n)
//space complexity:O(n)

class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int length=s.length();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)==3){
          length=length-2;
          map.put(c,1);
            }
        }
        return length;
    }
}
