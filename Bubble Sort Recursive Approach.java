//Function to sort the array using bubble sort algorithm.
    //in bubble sort we puch maximum element at end by adjecent swaps
    //so after each iterartion array is sorted in range 0 to n-i-1
class Solution
{
	public static void bubbleSort(int arr[], int n)
    {
        
        int flag=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                //swap
                flag=1;
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        if(flag==1){
        if(n>0){
            bubbleSort(arr,n-1);
        }
            
        }
        
    }
    
}
