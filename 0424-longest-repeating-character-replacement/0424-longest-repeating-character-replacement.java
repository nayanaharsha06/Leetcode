class Solution {
    public int characterReplacement(String s, int k) {
        int w_start = 0; // window_start
        int max_length = 0; // Initialize to 0 to track the maximum length
        int[] char_counts = new int[26]; // Array to count occurrences of each character
        int max_count = 0; // Track the count of the most frequent character in the current window
        
        for (int w_end = 0; w_end < s.length(); w_end++) {
            char_counts[s.charAt(w_end) - 'A']++; // Increment the count of the current character
            int curr_char_count = char_counts[s.charAt(w_end) - 'A']; // Get the count of the current character
            max_count = Math.max(max_count, curr_char_count); // Update max_count to the highest character count in the window
            
            // Check if the current window size minus the count of the most frequent character is greater than k
            while (w_end - w_start - max_count + 1 > k) {
                char_counts[s.charAt(w_start) - 'A']--; // Decrement the count of the character at w_start
                w_start++; // Shrink the window from the left
            }
            
            // Update the maximum length of the valid substring found so far
            max_length = Math.max(max_length, w_end - w_start + 1);
        }
        
        return max_length; // Return the length of the longest valid substring
    }
}
