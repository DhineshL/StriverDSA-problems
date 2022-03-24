import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {

    /**
     * Returns the length of the longest consecutive array without repeating character
     *
     * Uses hashset to keep track of repeating character. It uses two pointers left and right. right increases till it
     * finds new a character that is repeating and left increases till it removes the character that is repeating
     * this way it keep tracks of non repeating character sub array
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int left =0;
        int right=0;
        int count =0;
        int ans =0;
        while(right<s.length()){
            char t = s.charAt(right);
            if(!set.contains(t)){
                right++;
                count++;
                set.add(t);
                ans = Math.max(ans,count);
            }
            else{

                set.remove(s.charAt(left));
                left++;
                count--;
            }

        }
        return ans;
    }
}
