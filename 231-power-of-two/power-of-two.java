class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        // Check if n is a power of two by dividing it by 2 repeatedly
        while (n % 2 == 0) {
            n = n / 2;
        }
        
        // If n has been reduced to 1, then it was a power of two
        return n == 1;
    }
}