class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int[] arr = new int[2];
        arr[0] = -1; 
        arr[1] = -1;
        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] < target){
                i = mid+1;
            }else if(nums[mid] > target){
                j = mid-1;
            }else if(nums[mid ] == target){
                int left = mid;
                int right = mid;
                while (left > 0 && nums[left - 1] == target) {
                    left--;
                }
                
                // Expand right to find the end position
                while (right < nums.length - 1 && nums[right + 1] == target) {
                    right++;
                }
                arr[0] = left;  // Set the start position
                arr[1] = right;  // Set the end position
                break;
                

            }
        }
        return arr;
    }
}