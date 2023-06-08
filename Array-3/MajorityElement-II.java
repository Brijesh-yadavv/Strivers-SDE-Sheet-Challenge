import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> al=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=arr.size();
        int v=n/3;
        for(int i=0;i<arr.size();i++){
            hm.put(arr.get(i),hm.getOrDefault(arr.get(i), 0)+1);
        }
        for(int i=0;i<arr.size();i++){
            if(hm.get(arr.get(i))>v){
                set.add(arr.get(i));
            }
        }

        for(Integer i:set){
            al.add(i);
        }
        return al;

    }
}
