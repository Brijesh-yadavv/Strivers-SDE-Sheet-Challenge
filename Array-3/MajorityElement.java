import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int ans=-1;
		int v=n/2;
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
		}
		for(int nn:arr){
			if(hm.get(nn)>v){
				ans=nn;
				break;
			}
		}
		return ans;

	}
}
