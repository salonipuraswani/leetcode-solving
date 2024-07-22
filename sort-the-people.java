// https://leetcode.com/problems/sort-the-people/
//time complexity:O(nlogn)
//space complexity:O(n)
class Solution {
class Pair{
    String name;
    int height;
     public Pair(int height,String name){
        this.height=height;
        this.name=name;
    }
}
    public String[] sortPeople(String[] names, int[] heights) {
        //brute force was to use hashmap,but the sorting goes very complicated in case of hashmap,so we are using pairs.we are defining our own pair class.
        int n=names.length;
        ArrayList<Pair> list=new ArrayList<>();
       for(int i=0;i<n;i++){
       Pair pair=new Pair(heights[i],names[i]);
       list.add(pair);
       }
      Collections.sort(list,(x,y)->y.height-x.height);
      for(int i=0;i<n;i++){
        names[i]=list.get(i).name;
      }
      return names;
    }
}

