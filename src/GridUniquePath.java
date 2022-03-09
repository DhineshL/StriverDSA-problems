class GridUniquePath  {


    /**
     * This method calculates the number of  uniques path in a grid from start (0,0) to the last element (m-1,n-1)
     *
     * It uses combinatorics to (m+n-2)Cn or (m+n-2)Cm to find the path.
     *
     * m+n-2 - number of path or steps from start to end in a grid
     *
     * n,m - number of right and down steps that should be taken to reach the end
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int N = m+n-2;
        int r = m-1;
        double ans = 1;
        for(int i=1;i<=r;i++){
            ans = ans * (N-r+i)/i;
        }


        return (int) ans;
    }
}