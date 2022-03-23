public class Search2DMatrix {

    /**
     * This method searches for a target in row and column sorted matrix where each starting element in a row is greater
     * than the previous end element
     *
     * Uses Binary search to find the element , uses the row and column index to position the element for binary search
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = matrix.length * matrix[0].length - 1;
        while(low<=high){
            int index = (low+high)/2;
            int indexes[] = getIndex(index,matrix[0].length);
            int i = indexes[0];
            int j = indexes[1];

            if(matrix[i][j]==target){
                return true;
            }
            else if (matrix[i][j]>target){
                high = index-1;
            }
            else if (matrix[i][j] < target){
                low = index+1;
            }

        }
        return false;
    }

    private static int[] getIndex(int no, int c){
        int[] ans = new int[2];
        ans[0]= no/c;
        ans[1]= no%c;

        return ans;
    }
}
