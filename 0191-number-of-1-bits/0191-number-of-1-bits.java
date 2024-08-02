class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count += n & 1;
            n = n>>>1;
        }
        return count;
    }
}


/*public int hammingWeight(int n) {
        int a = Integer.bitCount(n);
        return a;
    }
*/