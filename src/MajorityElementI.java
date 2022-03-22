public class MajorityElementI {

    /**
     * It returns majority element (m) in the array
     *
     * Uses majority voting algorithm to fetch the number
     * since the m should be left after some pairing or reducing the count
     * the element whose count greater than 0 will be the majority element
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==element) count++;
            else count--;
            System.out.println(count);
            if(count==0){
                element = nums[i];
                count=1;
            }
        }
        return element;
    }
}
