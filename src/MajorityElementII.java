import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    /**
     * It returns majority element (m) in the array
     *
     * Uses majority voting algorithm to fetch the number
     * since the m should be left after some pairing or reducing the count
     * the element whose count greater than 0 will be the majority element
     * Similarly the element
     *
     * @param nums
     * @return
     */

    public List<Integer> majorityElement(int[] nums) {
        int m1=0;
        int c1=0;
        int m2=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1) c1++;
            else if(nums[i]==m2) c2++;
            else if(c1==0){
                m1=nums[i];
                c1=1;
            }
            else if(c2==0){
                m2=nums[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> ans = new ArrayList<Integer>(2);
        c1=0;
        c2=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==m1)c1++;
            else if(nums[i]==m2)c2++;
        }
        if(c1>nums.length/3) ans.add(m1);
        if(c2>nums.length/3) ans.add(m2);

        return ans;
    }
}
