class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        String str = "";

        for(int i = arr.length - 1; i >= 0; i--){
            str = str + arr[i];
        }

        return str.equals(s);

    }
}