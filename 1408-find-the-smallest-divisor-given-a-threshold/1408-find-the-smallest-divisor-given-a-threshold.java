class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while(low <= high){
            int mid = ( high + low)/2;
            int res = 0;

            for(int i = 0 ; i< nums.length ; i++){
                res += (int) Math.ceil((double)(nums[i])/ mid);
                if(res > threshold) break;
            }
            if(res > threshold){
                low = mid +1;
            }else {
                high =  mid - 1;
            }
        }
        return low;
    }
}