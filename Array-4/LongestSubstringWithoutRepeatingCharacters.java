import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		//write your code here
		      if(s.length()==0)
            return 0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        int n=s.length();
        while(j<n){
            if(!hm.containsKey(s.charAt(j))){
                hm.put(s.charAt(j),1);
                   max=Math.max(max,j-i+1);
                j++;
            }else{
            while(hm.containsKey(s.charAt(j))) {
                int t=hm.get(s.charAt(i));
                t--;
                if(t==0)
                    hm.remove(s.charAt(i));
                else
                    hm.put(s.charAt(i),t);
                i++;
                
            }
                hm.put(s.charAt(j),1);
                j++;
            }
            
        }
          
        return max;
	}
}
