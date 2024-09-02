class Solution {
    public int chalkReplacer(int[] chalk, int k) {
         int students=chalk.length;
         int sum=0;
         int seq=0;
         for(int i=0;i<chalk.length;i++){
            if(k<sum){
                return i-1;
            }
            else{
                sum=sum+chalk[i];
            }
         }
         int mod=k%sum;
         sum=0;
         for(int i=0;i<chalk.length;i++){
            if(sum<mod){
                sum=sum+chalk[i];
                if(sum>mod){
                    seq=i;
                    break;
                }
            }
            else{
                seq=i;
                break;
            }
         }
          return seq;
    }
}
