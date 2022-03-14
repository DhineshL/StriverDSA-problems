public class MergeTwoSortedArray {

    /**
     * This method sorts two array in constant space
     *
     * uses GAP method - a gap variable is set to (m+n+1)/2 or ceil((m+n)/2) and decrement ceil(gap/2) after each iteration
     *
     * two pointers having gap distance are compared and swapped till the gap becomes zero
     *
     * @param arr1
     * @param arr2
     * @param n
     * @param m
     */
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int gap = (m + n + 1) / 2;
        while (gap > 0) {
            int ptr1 = 0;
            int ptr2 = gap;
            for (; ptr2 < n; ptr2++, ptr1++) {
                if (arr1[ptr1] > arr1[ptr2]) {
                    long temp = arr1[ptr1];
                    arr1[ptr1] = arr1[ptr2];
                    arr1[ptr2] = temp;
                }
            }
            for (ptr2 -= n; ptr2 < m && ptr1 < n; ptr1++, ptr2++) {
                if (arr1[ptr1] > arr2[ptr2]) {
                    long temp = arr1[ptr1];
                    arr1[ptr1] = arr2[ptr2];
                    arr2[ptr2] = temp;
                }
            }
            if (ptr2 < m) {
                for (ptr1 -= n; ptr2 < m; ptr1++, ptr2++) {
                    if (arr2[ptr1] > arr2[ptr2]) {
                        long temp = arr2[ptr1];
                        arr2[ptr1] = arr2[ptr2];
                        arr2[ptr2] = temp;
                    }
                }
            }
            gap = gap == 1 ? 0 : (gap + 1) / 2;
        }
    }
}
