 //approach:find number of changes to made in rows to make them palindrome;number of changes to be made in columns and then take minimum.
 //how to do it(for row): make a two pointer approach
class Solution {
    public int minFlips(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int row_changes=0;
       int column_changes=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m/2;j++){
            if(grid[i][j]!=grid[i][m-j-1]){
                row_changes++;
            }
        }
       }
       for(int j=0;j<m;j++){
        for(int i=0;i<n/2;i++){
            if(grid[i][j]!=grid[n-i-1][j]){
                column_changes++;
            }
        }
       }
       int min=Math.min(row_changes,column_changes);
       return min;
    }
}
