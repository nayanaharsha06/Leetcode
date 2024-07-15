//https://www.youtube.com/watch?v=r-CfSC3Ztlc
//https://www.youtube.com/watch?v=i8Lay6smOWs&t=418s
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> subList = new ArrayList<>();
        solve(nums, 0 ,subList);
        return res;
    }
    public void solve(int[] nums, int start, List<Integer> subList ){
        if(start == nums.length){
            res.add(new ArrayList<>(subList));
            return;
        }

        int cc = nums[start];
        subList.add(cc);
        solve(nums, start+1, subList);
        subList.remove((Integer)cc);
        solve(nums, start+1, subList);
    }
}