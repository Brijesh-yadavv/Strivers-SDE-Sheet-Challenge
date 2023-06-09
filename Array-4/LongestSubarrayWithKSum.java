import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(0,-1);
		int ar[]=new int[arr.size()];
		int sum=0;
		int max=0;
		for(int i=0;i<arr.size();i++){
			if(i==0){
				ar[i]=arr.get(0);	
			}
			else{
							sum=ar[i-1]+arr.get(i);

				ar[i]=sum;

			}
		}
		for(int i=0;i<ar.length;i++){
			if(hm.containsKey(ar[i])){
				max=Math.max(max,i-hm.get(ar[i]));
			}
			else{
				hm.put(ar[i],i);
			}
		}

return max;
	}
}
