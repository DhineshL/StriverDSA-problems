import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {

    /**
     * This method returns maximum length of the sub-array having zero sum
     *
     * It uses hashmap to store the sum at each index, if total sum till a index is present in the hashmap it means the sub-array is
     * zero from the index in the hashmap till the current index
     * i.e the sum is already present in the hashmap . therefore in order to make the similar total sum a zero sub-array must be present
     * to make the array sum equal
     *
     * @param arr
     * @param n
     * @return
     */
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int maxLen =0;
        // calculate sum at each index (total sum)
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            if(sum==0){
                maxLen = Math.max(maxLen,i+1);
            }
            else{
                if(map.containsKey(sum)){
                    int index = map.get(sum);
                    maxLen = Math.max(maxLen, i-index);
                }
                else map.put(sum,i);
            }
        }




        return maxLen;

    }
}
