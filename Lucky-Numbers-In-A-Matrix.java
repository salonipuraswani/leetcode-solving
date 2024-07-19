//brute force approach
//time complexity:O(n*m)
//space complexity:O(n+m)
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=matrix.length;
        int m=matrix[0].length;
        int minR[]=new int[n];
        int maxC[]=new int[m];
        
        for(int i=0;i<n;i++){
            int min_r=0;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<matrix[i][min_r]){
                    min_r=j;
                }
            }
            minR[i]=min_r;
        }

        for(int j=0;j<m;j++){
            int max_c=0;
            for(int i=0;i<n;i++){
                if(matrix[i][j]>matrix[max_c][j]){
                    max_c=i;
                }
            }
            maxC[j]=max_c;
        }

        for(int i=0;i<n;i++){
            int a=minR[i];
            if(maxC[a]==i){
                list.add(matrix[i][minR[i]]);
            }
        }
        return list;
    }
}
