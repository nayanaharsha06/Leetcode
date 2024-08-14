class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for(int num : nums){
            if(num > 0){
                pos.offer(num);
            }else{
                neg.offer(num);
            }
        }
        
        int i = 0;
        while(!pos.isEmpty() && !neg.isEmpty()){
            nums[i++] = pos.poll();
            nums[i++] = neg.poll();
        }

        return nums;
    }
}