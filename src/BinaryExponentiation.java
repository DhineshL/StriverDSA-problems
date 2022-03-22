public class BinaryExponentiation {

    /**
     * This method returns exponent of a number
     *
     * It works by multiplying squares and reducing the power by 2 during even powers and multiplying to result during
     * odd power
     *
     * @param x
     * @param e
     * @return
     */
    public double myPow(double x, int e) {
        boolean neg= false;
        long n = e;
        if(n<0){
            neg = true;
            n*=-1;
        }
        double ans = 1;
        while(n>0){
            if(n%2==1) ans*=x;
            x *= x;
            n/=2;
        }
        System.out.println(ans);
        if(neg) return (double)1.0/(double)ans;
        return ans;
    }
}
