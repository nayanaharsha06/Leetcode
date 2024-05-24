class Solution {
    public boolean isAnagram(String s, String t) {
        String s2 = s.toLowerCase();
        String t2 = t.toLowerCase();
        char[] s1 = s2.toCharArray();
        char[] t1 = t2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if(Arrays.equals(s1,t1)){
            return true;
        }else{
            return false;
        }



        
    }
}