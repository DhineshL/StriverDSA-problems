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
        int x = nums1.length;
        int y = nums2.length;

        if(x>y) return findMedianSortedArrays(nums2,nums1);

        boolean even = (x+y)%2==0;


        int start = 0;
        int end = x;

        while(start<=end){
            int partitionX = (start+end)/2;
            int partitionY = (x+y)/2 - partitionX;

            int xMinIndex = partitionX-1;
            int xMaxIndex = partitionX;

            int yMinIndex = partitionY-1;
            int yMaxIndex = partitionY;

            int xMin = (partitionX==0)?Integer.MIN_VALUE:nums1[xMinIndex];
            int xMax = (partitionX==x)?Integer.MAX_VALUE:nums1[xMaxIndex];

            int yMin = (partitionY==0)?Integer.MIN_VALUE:nums2[yMinIndex];
            int yMax = (partitionY==y)?Integer.MAX_VALUE:nums2[yMaxIndex];

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