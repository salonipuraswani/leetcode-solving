// https://leetcode.com/problems/sort-the-jumbled-numbers/
//brute force(may optimize later)
//time complexity:O(nlogn)
class Solution {
    //function to convert nums[i] to integer array to seperate the digits of nums
    public int[] convertToDigit(int n){
       if (n == 0) {
            return new int[]{0};
        }
        int digitsCount = (int) Math.log10(n) + 1;
        int[] digits = new int[digitsCount];
        for (int i = 0; i < digitsCount; i++) {
            digits[digitsCount - 1 - i] = n % 10;
            n /= 10;
        }
        return digits;
    }
    public int convertToNumber(int[] digits){
        int n=digits.length;
        int num=0;
        int mf=1;
        for(int i=n-1;i>=0;i--){
             num=num+(digits[i]*mf);
             mf=mf*10;
        }
        return num;
    }
    public int findKey(int value,HashMap<Integer,Integer> map){
         for(int key: map.keySet()){
            if(value==map.get(key)){
                map.put(key,-1);
                return key;
            }
         }
         return -1;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int replaced[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int digits[]=convertToDigit(nums[i]);
            int replacedDigits[]=new int[digits.length];
            for(int j=0;j<digits.length;j++){
              replacedDigits[j]=mapping[digits[j]];
            }
            replaced[i]=convertToNumber(replacedDigits);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<replaced.length;i++){
            map.put(i,replaced[i]);
        }
        Arrays.sort(replaced);
        int i=0;
        int[] ans=new int[nums.length];
        for(int key: map.keySet()){
            int value=replaced[i];
            ans[i]=findKey(value,map);
            i++;

        }
        for(int j=0;j<nums.length;j++){
            replaced[j]=nums[ans[j]];
        }
        return replaced;
    }
}
