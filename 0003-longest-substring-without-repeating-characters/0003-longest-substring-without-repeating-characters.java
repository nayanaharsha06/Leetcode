class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int count = 1;
        int j = 0;
        if(s.equals("")) return 0;
        HashSet<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                count = Math.max(j-i+1, count);
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}