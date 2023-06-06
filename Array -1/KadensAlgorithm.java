import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long max=0;
		long curr_sum=0;
		for(int i=0;i<arr.length;i++){
			curr_sum+=arr[i];
			if(curr_sum>max){
				max=curr_sum;
			}
			
				curr_sum=Math.max(curr_sum,0);
			
		}
		return max;
	}

}
