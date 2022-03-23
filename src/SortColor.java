public class SortColor {

    /**
     * This method uses dutch national flag algorithm to sort nums of 0,1,2s
     *
     * red always point to index where all elements less than red index will be 0
     * white always point to index where all elements less than white index will be 1
     * blue always point to index where all elements grater than red index will be 2
     *
     * such that at the end of n traversal all elements arranged 
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[white]==0){
                nums[white] = nums[red];
                nums[red]=0;
                red++;
                white++;
            }
            else if(nums[white]==2){
                nums[white]=nums[blue];
                nums[blue]=2;
                blue--;
            }
            else white++;
        }

    }
}