import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSum {

    /**
     * This method returns the length of longest consecutive sequence present in the array
     *
     * It uses hashset to store all the elements in the array
     * Then it searches for starting element of the sequence by searching
     * the previous number in hashset (nums[i]-1) If not present it searches the next element and so on by increasing the counter
     *
     *
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int ans = 0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:nums){
            int count = 1;
            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
            }
            ans = Math.max(ans,count);
        }


        return ans;
    }
}
