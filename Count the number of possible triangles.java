//link
//https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1
//solution:3 pointers approach
//time complexty: total time complexity is O(n^3) ;sorting:O(nlogn) , all possible combinations:O(n^3)
//time complexity of all possible combinations is n^3 because number of possible combinations is nC3 which is equal to n*(n-2)*(n-3)/6 which is n^3
//space complexity :O(1) ;no extra space needed
class Solution {
    
    static int countTriangles(int arr[]) {
        //sort the array
        int count=0;
        int n=arr.length;
        Arrays.sort(arr);
        //3 pointers
        int side1=0;
        int side2=1;
        int side3=2;
        while(side1<n-2){
          while(side2<n-1){
            while(side3<n){
            if(arr[side1]+arr[side2]>arr[side3]){
                count++;
            }
            side3++;
        }
        side2++;
        side3=side2+1;
        }
        side1++;
        side2=side1+1;
        side3=side2+1;
        }
       return count; 
        
    }
}
