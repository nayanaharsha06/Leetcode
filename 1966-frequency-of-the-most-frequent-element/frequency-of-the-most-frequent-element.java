class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;  // Left pointer of the sliding window
        long sum = 0; // To store the total increments required
        int maxLength = 0; // To track the maximum frequency (window size)

        for(int j = 0 ; j < nums.length ; j++){
            sum += (long)nums[j];  // Accumulate the total sum of the window

            while((long)nums[j] * (j - i + 1) - sum > k){
                sum -=  nums[i]; // Adjust the sum by removing the leftmost element
                i++;
            }
             // Update the maxLength with the size of the current window
            maxLength = Math.max(maxLength, j - i +1);
        }
        return maxLength;
    }
}