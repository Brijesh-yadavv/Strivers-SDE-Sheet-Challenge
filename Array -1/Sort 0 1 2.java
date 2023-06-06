import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int lo=0;
        int h=arr.length-1;
        int m=0;
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[lo];
                arr[lo]=temp;
                lo++;
                m++;
            }
             else if(arr[m]==1){
                m++;
            }
            else{
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                
                h--;
            }
        }
    }
}
