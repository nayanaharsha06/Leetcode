//https://www.youtube.com/watch?v=WD-vqCYm5hc
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(res, nums, 0);
        return res;
    }

    public void solve(List<List<Integer>> res, int[] nums, int start){
        if(start == nums.length){
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            res.add(current);

        }else{
            for(int i = start ; i < nums.length ; i++){
                swap(i,start,nums);
                solve(res, nums, start+1);
                swap(i, start,nums);
            }
        }
    }

    public void swap(int i, int start, int[] nums){
        int temp = nums[i];
        nums[i] = nums[start];
        nums[start] = temp;
    }
}