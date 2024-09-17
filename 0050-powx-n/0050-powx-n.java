class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        if (n < 0) {
             if (n == Integer.MIN_VALUE) {
                n = Integer.MIN_VALUE + 1; // Increment by 1 to avoid overflow
                return (1 / x) * myPow(x, n);
            }
            x = 1 / x;
            n = -n;
        }

        double half = myPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            // If n is odd
            return half * half * x;
        }

        
    }
}