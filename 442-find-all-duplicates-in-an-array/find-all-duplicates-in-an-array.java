class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res= new ArrayList<>();
        for(int num : nums){
            if(set.contains(num)){
                res.add(num);
            }else{
                set.add(num);
            }

        }
        return res;
    }
}