class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> arr = new ArrayList<>();
        int threshold = nums.length/3;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            if(val > threshold){
                arr.add(key);
            }
        }
        return arr;
    }
}