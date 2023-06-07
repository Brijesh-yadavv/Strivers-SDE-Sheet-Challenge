import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int s=0;
        for(Integer i:arr)
        s+=i;
        int sn=n*(n+1)/2;
        int xmy=s-sn;
        int s2=0;
        for(Integer i:arr)
        s2+=i*i;
        int sn2=0;
        for(int i=1;i<=n;i++){
            sn2+=i*i;
        }
        int xpy=(s2-sn2)/(xmy);
        int rep=((xpy)+(xmy))/2;
        int miss=xpy-rep;
        int ar[]=new int[2];
        ar[0]=miss;
        ar[1]=rep;
        return ar;
    }
}
