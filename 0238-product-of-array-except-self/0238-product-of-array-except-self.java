class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = 1;
        for(int x = 1; x < n ; x++){
            left[x] = left [x-1]*nums[x-1];
        }

        right[n-1] = 1;
        for(int y = n-2; y >-1 ; y--){
            right[y] =  right[y+1]* nums[y+1];
        }
        
        int[] ans = new int[n];
        for(int i = 0 ; i<n; i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}