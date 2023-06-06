import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
                int max=0;
        int sell=prices.get(0);
        for(int i=0;i<prices.size();i++){
            max=Math.max(max,prices.get(i)-sell);
            sell=Math.min(sell,prices.get(i));
        }
        return max;
    }
}
