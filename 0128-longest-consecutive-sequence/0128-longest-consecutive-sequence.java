class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for (int num : nums) a.add(num);

        
        int result = 0;
        for(int num : nums){
            int curr = 0;
            while(a.contains(num) && !a.contains(num+1)){
                curr++;
                a.remove(num);
                num--;
            }
            result = Math.max(result,curr);
        }
        return result;
        
    }
}

