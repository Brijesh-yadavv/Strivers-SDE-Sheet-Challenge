import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		HashMap<Integer,Integer> hm=new HashMap<>();
		int xor=0;
		int c=0;
		hm.put(0,1);
		for(int i=0;i<arr.size();i++){
		
			
				xor=xor^arr.get(i);
		
				if(hm.containsKey(xor^x)){
					c=c+hm.get(xor^x);
				}
				
					hm.put(xor,hm.getOrDefault(xor, 0)+1);
				

			
		}
		
		return c;
	}
}
