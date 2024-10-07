class Solution {
    public int rob(int[] nums) {
        // If there is only one house, return its value.
        if (nums.length == 1) {
            return nums[0];
        }
        
        // If there are two houses, return the maximum of the two.
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        // Create two arrays:
        // One excluding the last house (skipLastHouse) and one excluding the first house (skipFirstHouse).
        int[] skipLastHouse = new int[nums.length - 1];
        int[] skipFirstHouse = new int[nums.length - 1];
        
        for (int i = 0; i < nums.length - 1; i++) {
            skipLastHouse[i] = nums[i];      // Exclude the last house.
            skipFirstHouse[i] = nums[i + 1]; // Exclude the first house.
        }
        
        // Get the maximum loot for both cases: skipping the first house or skipping the last house.
        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);
        
        // Return the maximum of the two possibilities.
        return Math.max(lootSkippingLast, lootSkippingFirst);
    }

    // Helper function to solve the House Robber problem for a linear arrangement of houses.
    private int robHelper(int[] nums) {
        // If there's only one house, return its value.
        if (nums.length == 1) {
            return nums[0];
        }
        
        // Initialize the dynamic programming (dp) array.
        int[] dp = new int[nums.length];
        dp[0] = nums[0]; // Max loot for the first house is its value.
        dp[1] = Math.max(nums[0], nums[1]); // Max loot for the second house is the maximum of the first two houses.
        
        // Fill the dp array using dynamic programming.
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]); // Either rob the current house or skip it.
        }
        
        // The last element of the dp array contains the maximum loot.
        return dp[nums.length - 1];
    }
}
