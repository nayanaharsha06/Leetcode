import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (map.containsKey(charS)) {
                // Check if the previously mapped character is different
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                // If charT is already mapped to another character, return false
                if (map.containsValue(charT)) {
                    return false;
                }
                // Map charS to charT
                map.put(charS, charT);
            }
        }
        
        return true;  // Return true if all characters are correctly mapped
    }
}
