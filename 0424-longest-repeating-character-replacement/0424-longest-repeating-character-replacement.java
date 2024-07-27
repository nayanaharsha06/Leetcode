//https://www.youtube.com/watch?v=y0-x7GSTzu0
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int window_start = 0;
        int maxCount = 0;
        int[] arr = new int[26];
        int maxLength = 0;

        for(int window_end = 0; window_end < n ; window_end++){
            arr[s.charAt(window_end) - 'A']++;
            int curr_char_count = arr[s.charAt(window_end)-'A'];
            maxCount = Math.max(maxCount,curr_char_count);

            while(window_end - window_start - maxCount + 1 >k){
                arr[s.charAt(window_start) - 'A']--;
                window_start++;
            }
            maxLength = Math.max(maxLength, window_end - window_start +1);

        }
        return maxLength;
    }
}