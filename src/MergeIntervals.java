import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    /**
     *This method merges two array if one element falls in between range of the other array
     *
     * It sorts array elements by first element and checks if the second element falls
     * within the range if not it includes else it creates new array
     *
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {

        if(intervals.length<=1) return intervals;

        Arrays.sort(intervals,(i, j)-> Integer.compare(i[0],j[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int [] interval:intervals){
            if(newInterval[1]>=interval[0]){
                newInterval[1]=Math.max(interval[1],newInterval[1]);
            }
            else{
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
