public class MaximumSubArraySum {
    /**
     * This method uses kadane algorithm and calculates the maximum subarray sum
     *
     * It works by asking if adding the next element to sum is greater than element itself.Since
     * taking the element itself maximizes the sum while taking the former reduces the sum
     *
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for(int i=1;i<nums.length;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}
