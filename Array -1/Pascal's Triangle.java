import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> ans=new ArrayList<>();
				 ArrayList<Long> al=new ArrayList<>();
				 al.add(1l);
				 				 

				 ans.add(al);
				 if(n==1){
					 return ans;

				 }
				//  System.out.println(ans);
				ArrayList<Long> a=new ArrayList<>();
				 a.add(1l);
				 a.add(1l);
				 ans.add(a);
				//  System.out.println(Arrays.toString(ans));
				 if(n==2)
				 return ans;
				 for(int j=3;j<=n;j++){
					 ArrayList<Long> all=new ArrayList<>();
					 ArrayList<Long> gt=ans.get(ans.size()-1);
					 
					 for(int i=0;i<gt.size();i++){
						 if(i==0){
							 all.add(gt.get(i));
						 }
						 if(i==gt.size()-1){
							 all.add(gt.get(i)+gt.get(i-1));
							 all.add(gt.get(i));
						 }
						 if(i!=0 && i!=gt.size()-1){
							 							 all.add(gt.get(i)+gt.get(i-1));

						 }
					 }
					 ans.add(all);
					
				 }
				 return ans;
	}
}
