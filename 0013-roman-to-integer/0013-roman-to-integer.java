import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = map.get(c);  // Get the integer value of the current character

            // Check if there is a next numeral and if it is greater than the current one
            if (i < s.length() - 1 && value < map.get(s.charAt(i + 1))) {
                // Subtract the current value because a smaller numeral precedes a larger numeral
                res -= value;
            } else {
                // Otherwise, add the current value
                res += value;
            }
        }
        return res;
    }
}
