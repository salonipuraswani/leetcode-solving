//brute force:store elements in hashset to find the distinct elements in array.then sort the list in which you have stored the elements of hashset.and then print the second last if its size is greater than 2.
//time complexity:O(nlogn)//time required for sorting
//space complexity:O(2n)->O(n)
class Solution {
    public int print2largest(int[] arr) {
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<arr.length;i++){
         set.add(arr[i]);
      }
      ArrayList<Integer> list=new ArrayList<>(set);
      Collections.sort(list);
      if(list.size()>=2){
          return(list.get(list.size()-2));
      }
      else{
          return -1;
      }
    }
}

//optimized
//time complexity:O(2n)->O(n)
//space complexity:O(1)
class Solution {
    public int print2largest(int[] arr) {
        //step1:find largest
        int largest=arr[0];
        int second_largest=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>largest){
               largest=arr[i];
           }
       }
       if(largest==arr[0]){
           second_largest=arr[1];
       }
       for(int i=1;i<arr.length;i++){
           if(arr[i]>second_largest && arr[i]<largest){
               second_largest=arr[i];
           }
       }
       return second_largest;
    }
}
