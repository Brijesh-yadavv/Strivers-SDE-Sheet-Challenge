import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Map<Integer,Integer> hm=new TreeMap<>();
        for(int i=0;i<N;i++){
            hm.put(arr[i],1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
            al.add(entry.getKey());
        }
        // System.out.println(al);
        int c=1;
        int max=1;
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)+1==al.get(i+1))
            c++;
            else{
                max=Math.max(c,max);
                c=1;
            }

        }
                        max=Math.max(c,max);



        return max;
    }
}
