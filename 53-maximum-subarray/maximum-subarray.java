//also called kadanes algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int a = nums[0]; //maxsum
        int b = nums[0];//currsum
        for(int i = 1; i < nums.length; i++){
            if( b< 0){
                b = 0;
            }
            b += nums[i];
            a = Math.max(a,b);
        }return a;

    }
}