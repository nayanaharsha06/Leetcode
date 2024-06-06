import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxAns = 0;
        int ps[] = prevSmaller(heights);
        int ns[] = nextSmaller(heights);
        for (int i = 0; i < heights.length; i++) {
            int curr = (ns[i] - ps[i] - 1) * heights[i];
            maxAns = Math.max(maxAns, curr);
        }
        return maxAns;
    }

    public int[] prevSmaller(int[] heights) {
        int ps[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public int[] nextSmaller(int[] heights) {
        int ns[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ns[i] = heights.length;
            } else {
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }

    
}
