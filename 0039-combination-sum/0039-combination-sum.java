class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        func(candidates, target, 0, new ArrayList<>());
        return result;
    }

    void func(int[] candidates, int currTarget,int position, List<Integer> curCombination){
        if(currTarget == 0){
            result.add(new ArrayList<>(curCombination));
            return;
        }
        if(position == candidates.length){
            return;
        }
        if(candidates[position] <= currTarget){
            curCombination.add(candidates[position]);
            func(candidates, currTarget - candidates[position], position, curCombination);
            curCombination.remove(curCombination.size() - 1);
            
        }
        func(candidates, currTarget, position + 1, curCombination);

    }
}