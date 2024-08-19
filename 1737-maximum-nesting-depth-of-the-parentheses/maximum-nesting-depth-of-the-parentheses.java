//https://www.youtube.com/watch?v=OqQdQ7dKlI0&t=55s
class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int curr = 0;
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                curr++;
                max = Math.max(max,curr);

            }else if( c== ')'){
                curr--;
            }
        }   
        return max;
    }
}