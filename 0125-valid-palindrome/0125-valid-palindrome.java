class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ","");
        s = s.replaceAll("[^0-9a-zA-Z]","");
        StringBuilder b = new StringBuilder(s);
        StringBuilder a = new StringBuilder(s).reverse();
        String b1 = b.toString();
        String a1 = a.toString();
        if(b1.equals(a1)){
            return true;
        }else{
            return false;
        }
    }
}