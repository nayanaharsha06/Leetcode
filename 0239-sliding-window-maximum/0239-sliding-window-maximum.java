import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> Qi = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements out of the current window
            if (!Qi.isEmpty() && Qi.peek() < i - k + 1) {
                Qi.poll();
            }

            // Remove elements smaller than the current element from the deque
            while (!Qi.isEmpty() && nums[i] >= nums[Qi.peekLast()]) {
                Qi.pollLast();
            }

            // Add current element at the back of the deque
            Qi.offer(i);

            // The element at the front of the deque is the largest element for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[Qi.peek()];
            }
        }

        return result;
    }
}