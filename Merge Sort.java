//time complexity:O(nlogn)
//space complexity:O(n)
// merge sort has a space complexity of O(n) where n is auxilary or temporary space required to merge two sorted arrays.(n is the size of array in this case) 
//merge sort is recursively dividing the input array into smaller subarrays, sorting them and merging them back together.
//In short,we divide the array into two halfs,sort each half and merge them back together.
class Solution
{
    void merge(int arr[], int low, int mid, int high)
    {
     ArrayList<Integer> list=new ArrayList<>();
     int left=low;
     int right=mid+1;
     while(left<=mid && right<=high){
        if(arr[left]<arr[right]){
         list.add(arr[left]);
         left++;
        }
        else{
            list.add(arr[right]);
            right++;
        }
     }
     while(left<=mid){
         list.add(arr[left]);
         left++;
     }
     while(right<=high){
         list.add(arr[right]);
         right++;
     }
     int j=0;
     for(int i=low;i<=high;i++){
         arr[i]=list.get(j);
         j++;
     }
     
    }
    void mergeSort(int arr[], int low, int high)
    {
        if(low>=high){
            return;
        }
        else{
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
}
