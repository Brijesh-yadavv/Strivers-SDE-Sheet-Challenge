import java.util.* ;
import java.io.*; 
public class Solution {
    public static long merge(long arr[],int left,int mid,int right,long temp[]){
        int inv_count=0;
    int i = left;
    int j = mid;
    int k = left;
    while((i <= mid-1) && (j <= right)){
        if(arr[i] <= arr[j]){
            temp[k++] = arr[i++];
        }
        else
        {
            temp[k++] = arr[j++];
            inv_count = inv_count + (mid - i);
        }
    }

    while(i <= mid - 1)
        temp[k++] = arr[i++];

    while(j <= right)
        temp[k++] = arr[j++];

    for(i = left ; i <= right ; i++)
        arr[i] = temp[i];
    
    return inv_count;

    }
    public static long merge_Sort(long arr[],int left,int right,long temp[]){
        int mid,inv_count = 0;
    if(right > left)
    {
        mid = (left + right)/2;

        inv_count += merge_Sort(arr,left,mid,temp);
        inv_count += merge_Sort(arr,mid+1,right,temp);

        inv_count += merge(arr,left,mid+1,right,temp);
    }
    return inv_count;
    }

    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long ans=0;
        long temp[]=new long[n];
        return merge_Sort(arr,0,n-1,temp);

    }
}
