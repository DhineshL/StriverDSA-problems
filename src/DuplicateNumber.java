class DuplicateNumber {

    /**
     * This algorithm uses floyd linked list cycle detection
     *
     * It uses two pointers slow (1 step) and fast (2 steps) to traverse the array and meets at a point
     * after that use another slow pointer traversing both slow pointers will meet at the duplicate index
     *
     * conditions = elements has to be 1 to n having array size n+1, duplicate can be any number of times with the range.
     *
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int slow =0, fast =0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow==fast) break;


        }while(true);

        int slow2=0;
        do{
            slow = nums[slow];
            slow2 = nums[slow2];

            if(slow==slow2) return slow;


        }while(true);

    }
}