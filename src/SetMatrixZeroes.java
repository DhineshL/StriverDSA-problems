public class SetMatrixZeroes {

    /**
     * This method sets zeroes to all elements along uts path of row and column in O(1) space
     *
     * it stores the zeroes count in the first row and first column of the matrix if any zeroes present in the matrix
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {

        boolean row = false;
        boolean col = false;

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j]==0){
                    if(i==0) row = true;
                    if(j==0) col = true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i =1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0||matrix[0][j]==0) matrix[i][j]=0;
            }
        }
        if(col){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
        if(row){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }

    }
}
