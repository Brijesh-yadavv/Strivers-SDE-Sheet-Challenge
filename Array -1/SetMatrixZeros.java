import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int mat[][]) {
        // Write your code here..
         int m=mat.length;
        int n=mat[0].length;
        HashMap<Integer,Integer> hmr=new HashMap<>();
        HashMap<Integer,Integer> hmc=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    hmr.put(i,1);
                        hmc.put(j,1);
                }
            }
        }
        
        //......................................
        for(int i=0;i<m;i++){
           
            for(int j=0;j<n;j++){
                if(hmc.containsKey(j))
                    mat[i][j]=0;
                 if(hmr.containsKey(i))
                   mat[i][j]=0;
            }
        }
    }

}
