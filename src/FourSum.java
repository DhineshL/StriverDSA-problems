import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    /**
     * This method returns distinct four element that add up to the target
     *
     * It uses double loop and two pointers in a sorted array to find the target and elements
     * It increases the counter till it finds the distinct element for each 4 elements.
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int low = j+1;
                int high = nums.length-1;
                int e1=nums[i];
                int e2=nums[j];

                while(low<high){
                    int curr_sum = e1+e2+nums[low]+nums[high];
                    if(curr_sum==target){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);

                        ans.add(temp);
                        while(low<high&&nums[low]==temp.get(2)) low++;
                        while(low<high&&nums[high]==temp.get(3)) high--;
                    }
                    else if(curr_sum<target)low++;
                    else high--;
                }
                while(j<nums.length-2&&nums[j]==nums[j+1]) j++;

            }
            while(i<nums.length-3&&nums[i]==nums[i+1]) i++;
        }


        return ans;
    }
}
