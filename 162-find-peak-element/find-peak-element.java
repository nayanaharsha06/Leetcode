class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is a peak element
            boolean isLeftGreater = mid > 0 && nums[mid] < nums[mid - 1];
            boolean isRightGreater = mid < nums.length - 1 && nums[mid] < nums[mid + 1];

            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (isLeftGreater) {
                end = mid - 1;
            } else if (isRightGreater) {
                start = mid + 1;
            }
        }

        // This line should never be reached because the while loop ensures a peak is found
        return -1;
    }
}
