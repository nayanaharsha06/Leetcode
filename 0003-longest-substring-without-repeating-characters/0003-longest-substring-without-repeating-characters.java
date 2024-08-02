//https://www.youtube.com/watch?v=3IETreEybaA&t=443s

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0;
        int b = 0; 
        int max = 0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        while(b<arr.length){
            if(!set.contains(arr[b])){
                set.add(arr[b]);
                max =  Math.max(b - a + 1, max);
                b++;
            }else{
                set.remove(arr[a]);
                a++;
                
            }
        }
        return max;
    }
}

