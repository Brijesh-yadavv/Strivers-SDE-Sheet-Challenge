class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //interchanging the vaue of arr[i][j] with arr[j][i]................
        for(int  i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //than reversing the all provided row
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
            int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
                }
        }
            
        
    }
}
