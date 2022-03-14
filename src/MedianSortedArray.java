class MedianSortedArray {

    /**
     * Finds median between two sorted array
     *
     * partitionX + partitionY = (nums1.length + nums2.length )/2  i.e equal half in case of odd partitionY will have one more element
     *
     * Divide the two arrays nums1,nums2 into two equal partitions partitionX and partitionY with elements from each
     * median will be present at the end of partitionX that will be Max(nums1[left_of_partition],nums2[left_of_partition])
     * similarly for the other partition Min(nums1[right_of_partition],nums2[right_of_partition])
     * if even : /2
     * or odd : find the median in the desired partition i.e partition having one size more than other
     *
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;//2
        int y = nums2.length;//2

        if(x>y) return findMedianSortedArrays(nums2,nums1);

        boolean even = (x+y)%2==0;


        int start = 0;
        int end = x;//2

        while(start<=end){
            int partitionX = (start+end)/2;//1
            int partitionY = (x+y)/2 - partitionX;//1

            int xMinIndex = partitionX-1;
            int xMaxIndex = partitionX;

            int yMinIndex = partitionY-1;
            int yMaxIndex = partitionY;

            int xMin = (partitionX==0)?Integer.MIN_VALUE:nums1[xMinIndex];//nusm1[0]=1
            int xMax = (partitionX==x)?Integer.MAX_VALUE:nums1[xMaxIndex];//nums1[1]=2

            int yMin = (partitionY==0)?Integer.MIN_VALUE:nums2[yMinIndex];//3
            int yMax = (partitionY==y)?Integer.MAX_VALUE:nums2[yMaxIndex];//4

            if(xMin<=yMax&&yMin<=xMax){
                if(even){
                    System.out.println("xMin:"+xMin+" xMax:"+xMax+" yMin:"+yMin+" yMax:"+yMax);
                    return (double)(Math.max(xMin,yMin)+Math.min(yMax,xMax))/2;
                }
                return Math.min(xMax,yMax);
            }

            if(xMin>yMax) end = partitionX-1;
            else start = partitionX+1;

        }
        throw new IllegalArgumentException();
    }
}