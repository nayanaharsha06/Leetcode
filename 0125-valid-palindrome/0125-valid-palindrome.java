class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ","");
        s = s.replaceAll("[^0-9a-zA-Z]","");
        
        return func(s,0,s.length()-1);
    }

    private boolean func(String s, int start, int end){
        if (start >= end) return true; 
        if (s.charAt(start) != s.charAt(end)) return false;
        return func(s, start+1, end-1);
    }
}

