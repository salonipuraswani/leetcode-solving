//time complexity:O(n^2)
//Function to sort the array using bubble sort algorithm.
//in bubble sort we puch maximum element at end by adjecent swaps
//so after each iterartion array is sorted in range 0 to n-i-1(so we the inner loop has range 0 to n-i-1)
//if there are no swaps in a particular iteration,it means that the array is already sorted.So we need not to check it over next iteration,so we break the outer loop if such scenario occurs.
class Solution
{
    
	public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    flag=1;
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
}
