import java.util.* ;

// import org.graalvm.compiler.lir.alloc.lsra.Interval;

import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval>list=new ArrayList<>();
        int c=0;
        int n=intervals.length;
        for(Interval i: intervals){
            c++;
        }
        int arr[][]=new int[c][2];
        for(int i=0;i<c;i++){//start end
        int s=intervals[i].start;

        int e=intervals[i].finish;
        arr[i][0]=s;
        arr[i][1]=e;
        }
 Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
      

        for (int i = 0; i < n; i++) { // select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            //Skip all the merged intervals:
            if (!list.isEmpty() && end <= list.get(list.size() - 1).finish) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            Interval in=new Interval(start,end);
            list.add(in);
        }
        
        

return list;
    }
}
