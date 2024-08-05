//brute force approach
//time complexity:O(N^2)
//space complexity:O(1)
class Solution {
    public boolean isDistinct(String[] arr,String s){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].compareTo(s)==0){
                count++;
            }
            if(count==2){
                return false;
            }
        }
        return true;
    }
    public String kthDistinct(String[] arr, int k) {
        String s="";
        int count=0;
        for(int i=0;i<arr.length;i++){
          if(isDistinct(arr,arr[i])){
              count++;
          }
          if(count==k){
            return arr[i];
          }
        }
        return(s);
    }
}

//optimal approach:hashmap
//time complexity:O(1)
//spcae complexity:O(N)
class Solution {
    public HashMap<String,Integer> frequencyMap(String[] arr){
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return map;
    }
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        map=frequencyMap(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                count++;
            }
            if(count==k){
                return arr[i];
            }
        }
        return "";
    }
}
