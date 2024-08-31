class Solution {
    public int[] arrayOfDigits(int n){
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=0;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
             list.add(n%10);
             n=n/10;
        }
        int j=0;
        for(int i=3;i>=0;i--){
            if(j<list.size()){
              arr[i]=list.get(j);
              j++;
            }
        }
        return arr;
    }
    public int countLeadingZeroes(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
    public int convertToNumber(int arr[]){
        int number=0;
        int mf=1;
        for(int i=arr.length-1;i>=0;i--){
            number=number+(arr[i]*mf);
            mf=mf*10;
        }
        return number;
    }
    public int generateKey(int num1, int num2, int num3) {
        int min[]=new int[4];
        int arr1[]=arrayOfDigits(num1);
            int arr2[]=arrayOfDigits(num2);
            int arr3[]=arrayOfDigits(num3);
        for(int i=0;i<4;i++){
            min[i]=arr1[i];
            if(arr2[i]<min[i]){
                min[i]=arr2[i];
            }
            if(arr3[i]<min[i]){
                min[i]=arr3[i];
            }

        }
        int ans=convertToNumber(min);
            return ans;
    }
}
