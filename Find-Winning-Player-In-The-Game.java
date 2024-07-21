
//   Example:

// Input: x = 4, y = 11

// Output: "Bob"

// Explanation:

// The game ends in 2 turns:

// Alice picks 1 coin with a value of 75 and 4 coins with a value of 10.
// Bob picks 1 coin with a value of 75 and 4 coins with a value of 10.

//time complexity:O(1)
//space complexity:O(1)
  
  class Solution {
    public String losingPlayer(int x, int y) {
        String winner[]={"Alice","Bob"};
        int i=1;
        while(x>=1 && y>=4){
         x=x-1;
         y=y-4;
         if(i==0){
            i=1;
         }
         else if(i==1){
            i=0;
         }
        }
        return winner[i];
    }
}
