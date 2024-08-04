//https://www.youtube.com/watch?v=C6AZyfj-Kyw
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i > max) return false;
            max = Math.max(i+nums[i], max);
            if(max  >= n - 1) return true;
        }
        return false;
    }
}

