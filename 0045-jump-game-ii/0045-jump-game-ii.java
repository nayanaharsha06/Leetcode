//https://youtu.be/BRnRPLNGWIo?si=FQybgPmUUBT7RLPd&t=403
//https://www.youtube.com/watch?v=9kyHYVxL4fw
class Solution {
    public int jump(int[] nums) {
        int curr = 0;
        int end = 0;
        int jumps = 0;

        while (end < nums.length - 1) {
            int farthest = 0;
            for (int i = curr; i <= end; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            curr = end + 1;
            end = farthest;
            jumps++;
        }
        return jumps;
    }
}
