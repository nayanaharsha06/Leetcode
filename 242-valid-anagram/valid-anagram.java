class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if(s.length() != t.length()){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);
    }
}
