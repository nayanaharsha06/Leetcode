class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n;
        for(int i = 0 ; i < n ; i++){
            res ^= nums[i] ^ i;
        }
        return res;
    }
}

// int missing = nums.length;
//         for(int i =0; i<nums.length ; i++){
//             missing ^= i^ nums[i];

//         }
//         return missing;
        