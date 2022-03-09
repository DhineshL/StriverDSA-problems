class ReversePairs {

    private static int mergeSort(int [] arr, int l , int r){
        int count = 0;
        if(l<r){
            int m = (l+r)/2;
            count+=mergeSort(arr, l,m);
            count+=mergeSort(arr,m+1,r);
            count+=merge(arr,l,m,r);
        }
        return count;
    }

    private static int merge(int [] arr,int l,int m,int r){

        int i2 = m+1;
        int ans = 0;

        // this loop increases the counter of i2 till it satisfies the condition then for each element of i thereafter it increments the count by the number of i2-(m+1)
        // i.e the number of elements in right array till the condition
        for(int i=l;i<=m;i++){
            while(i2<=r && 2*(long)arr[i2]< arr[i]){ i2++;}
            ans += (i2-(m+1));
        }


        int lSize = m-l+1;
        int rSize = r-m;

        int L[] = new int [lSize];
        int R[] = new int [rSize];

        for(int i=0;i<lSize;i++){
            L[i] = arr[l+i];
        }
        for(int j=0;j<rSize;j++){
            R[j] = arr[m+1+j];
        }

        int i=0,j=0,k=l;


        while(i<lSize&&j<rSize){
            if(L[i]<R[j]){
                arr[k++] = L[i++];
            }
            else{

                arr[k++] = R[j++];
            }
        }

        while(i<lSize){
            arr[k++] = L[i++];
        }

        while(j<rSize){
            arr[k++] = R[j++];
        }

        return ans;
    }

    /**
     * Finds pairs satisfying condition nums[i]>2*nums[j] where i<j
     *
     * Uses mergesort to sort array and at each step before merging it checks for pairs satisfying the condition
     *
     * @param nums
     * @return
     */

    public static int reversePairs(int[] nums) {
        int count = mergeSort(nums, 0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return count;
    }
}