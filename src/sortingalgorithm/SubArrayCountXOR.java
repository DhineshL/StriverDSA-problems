package sortingalgorithm;

import java.util.HashMap;
import java.util.Map;

public class SubArrayCountXOR {

    /**
     * returns count of subarrays having xor B
     *
     * It calculates all the prefix XOR (XOR till that index) and stores it in a map with count value.
     * since A^B = XR and B^XR = A we can calculate the count by checking the count of A or prefix XOR
     * in HashMap and adding to the count. Here XR is the XOR of all elements till the current Index
     *
     *
     * @param A
     * @param B
     * @return
     */
    public int solve(int[] A, int B) {
        int count=0;
        int xor_A = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int t:A){

            xor_A = xor_A ^ t;
            int xor_B = B ^ xor_A;

            if(xor_A==B) count++;

            if(map.containsKey(xor_B)){
                count += map.get(xor_B);
            }
            if(map.containsKey(xor_A)){
                map.put(xor_A,map.get(xor_A)+1);
            }
            else{
                map.put(xor_A,1);
            }
        }

        return count;
    }
}
