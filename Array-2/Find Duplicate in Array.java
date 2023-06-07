import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(hm.containsKey(arr.get(i))){
                return arr.get(i);
            }
            else{
                hm.put(arr.get(i),hm.getOrDefault(arr.get(i), 0)+1);
            }
        }
        return -1;
    }
}
