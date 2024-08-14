class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i  = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        return maxHeap.poll().getKey();
    }
}