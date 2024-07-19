//https://www.youtube.com/watch?v=Y6B-7ZctiW8
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        long rightProduct = 1;
        long leftProduct = 1;
        long ans = nums[0];

        for(int i = 0; i < n; i++){
            // if any of the leftProcuts or rightProduct is 0 then update it to 1
            if (leftProduct == 0 || leftProduct < Integer.MIN_VALUE)  leftProduct = 1;
            if (rightProduct == 0 || rightProduct < Integer.MIN_VALUE)  rightProduct = 1;

            leftProduct *= nums[i];
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans,  Math.max(leftProduct, rightProduct));
        }
        return (int)ans;
    }
}
       
