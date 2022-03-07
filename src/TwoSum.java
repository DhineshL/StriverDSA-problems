import java.util.HashMap;

public class TwoSum {

    /**
     * Uses HASHMAP to map the numbers in the list and checks if the target- currentNo is present in the map.
     *
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     *
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int no = target-nums[i];
            if(map.containsKey(no)){
                return new int[]{i, map.get(no)};
            }
            map.put(no, i);
        }
        return null;
    }
}
