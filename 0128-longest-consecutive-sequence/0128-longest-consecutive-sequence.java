class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for(int num: nums) res.add(num);

        int result = 0;
        for(int num : nums){
            int curr = 0;
            while(res.contains(num) && !res.contains(num+1)){
                curr++;
                res.remove(num);
                num--;
            }
            
            result = Math.max(result,curr);
        }

    return result;        
    }
}