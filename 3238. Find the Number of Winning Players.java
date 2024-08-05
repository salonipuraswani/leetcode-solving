//brute force approach
//time complexity:O(n*length)
//space complexity:O(length)
class Solution {
    public HashMap<Integer,Integer> frequencyMap(int[][] pick,int player){
        //frequency map for each player from 0 to n
        //player is player number-player number can be from 0 to n-1
        HashMap<Integer,Integer> map=new HashMap<>();
        int length=pick.length;
        for(int i=0;i<length;i++){
            if(pick[i][0]==player){
                map.put(pick[i][1],map.getOrDefault(pick[i][1],0)+1);
            }
        }
        return map;
    }
    public int winningPlayerCount(int n, int[][] pick) {
        int length=pick.length;
        int winner=0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            map=frequencyMap(pick,i);
         for(int key: map.keySet()){
             if(map.get(key)>i){
                winner++;
                break;
             }
         }
        }
        return winner;
    }
}
