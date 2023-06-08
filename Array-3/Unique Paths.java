import java.util.* ;
import java.io.*; 
public class Solution {
	public static int find_path(int m , int n,int dp[][]){
		if(m==0 && n==0)
		return 1;
		int up=0;
		int left=0;
		if(dp[m][n]!=-1)
		return dp[m][n];
		if(m>0)
		left=find_path(m-1, n,dp);
		if(n>0)
		up=find_path(m, n-1, dp);

		return dp[m][n]=left+up;

	}
	public static int uniquePaths(int m, int n) {
		int dp[][]=new int[m][n];
		for (int[] row : dp)  
            Arrays.fill(row, -1);  
		// Write your code here.
		return find_path( m-1, n-1, dp);
	}
}
