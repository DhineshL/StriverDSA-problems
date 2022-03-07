public class ReversePairs {

    public int reversePairs(int[] nums) {

        int count = 0;

        for (int i = nums.length - 1; i > 0; i--) {

            for (int j = i - 1; j >=0; j--) {
                if (((long) nums[j]) > (long) 2 * nums[i]) count++;
            }
        }
        return count;
    }
}
