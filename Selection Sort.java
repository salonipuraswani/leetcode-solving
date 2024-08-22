//time complexity:O(n^2)
//even though time complexity of selection sort is same as that of bubble sort but selection sort is considered to be better than bubble sort because ,in bubble sort on each index we do n-1 swaps,but in selection sort ,on each index we do only one swap.
//also the major difference between selection sort and bubble sort is that, in selection sort on each swap,we push minimum element in the beginning and in bubble sort we puch maximim element at the end.
//selection sort:
// First, we will select the range of the unsorted array using a loop (say i) that indicates the starting index of the range.
// The loop will run forward from 0 to n-1. The value i = 0 means the range is from 0 to n-1, and similarly, i = 1 means the range is from 1 to n-1, and so on.
// (Initially, the range will be the whole array starting from the first index.)
// Now, in each iteration, we will select the minimum element from the range of the unsorted array using an inner loop.
// After that, we will swap the minimum element with the first element of the selected range(in step 1). 
// Finally, after each iteration, we will find that the array is sorted up to the first index of the range
class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        //find the index with minimum element in the array
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<arr.length;i++){
	        int min=select(arr,i);
	        int temp=arr[i];
	        arr[i]=arr[min];
	        arr[min]=temp;
	    }
	}
}
