//https://www.youtube.com/watch?v=y0-x7GSTzu0
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] arr = new int[26];
        int max_count = 0;
       
        int a = 0;
        int max = 0;


        for(int b = 0; b < s.length() ; b++){
            arr[s.charAt(b) - 'A']++;
            int curr_Char_count = arr[s.charAt(b) - 'A'];
            max_count = Math.max(max_count, curr_Char_count);
            //maxCount is updated to the highest frequency of any character in the current window
            while(b- a - max_count + 1 > k){
                arr[s.charAt(a)- 'A']--;
                a++;
            }
            max = Math.max(b-a+1,max);
        }
        return max;



    }
}