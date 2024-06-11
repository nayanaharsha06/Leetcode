class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int s1_len = s1.length();
        int s2_len = s2.length();

        if(s2 == null || s2.length() ==0 || s1_len > s2_len){
            return false;
        }
        int[] ar1 = new int[26];
        int[] ar2 = new int[26];

        for(int i= 0 ; i < s1.length(); i++){
            ar1[s1.charAt(i) - 'a']++;
            ar2[s2.charAt(i) - 'a']++;
        }
        
        for(int i =0; i< s2_len - s1_len; i++){
            if(isPermutation(ar1,ar2)) return true;

            ar2[s2.charAt(i) - 'a']--;
            ar2[s2.charAt(i + s1_len) - 'a']++;
        }
        if(isPermutation(ar1,ar2)) return true;
        return false;
        
    }

    public boolean isPermutation(int[] ar1, int[] ar2){
        for(int i =0;i < ar1.length ; i++){
            if(ar1[i] != ar2[i]){
                return false;
            }
        }return true;
    }


}