//count the number of next greater elements to the right of indices mentioned in the indices array
    
    //brute force:array based
    //time complexity:O(queries*n)
    //space complexity:O(1)
class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    int ans[]=new int[queries];
    int count=0;
    for(int i=0;i<queries;i++){
        count=0;
        for(int j=indices[i]+1;j<N;j++){
            if(arr[j]>arr[indices[i]]){
                count++;
            }
        }
        ans[i]=count;
    }
    return ans;
  }
}
