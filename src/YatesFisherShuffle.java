import java.util.Arrays;
import java.util.Random;

public class YatesFisherShuffle {
    public static int[] shuffle(int []arr){
        Random random = new Random();
        for(int i = arr.length-1;i>0;i--){
            int next = random.nextInt(i+1);
            int temp = arr[next];
            arr[next] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
