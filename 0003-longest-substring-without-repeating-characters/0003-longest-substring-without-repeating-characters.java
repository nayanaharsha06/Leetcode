class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max =0;

        HashSet<Character> h = new HashSet<>();

        while(b_pointer < s.length()){
            if(!h.contains(s.charAt(b_pointer))){
                h.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(h.size(), max);
            }else {
                h.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }return max;
    }
}