class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap = 0;
        int maxcap = 0;
        for(int cap : weights){
            mincap = Math.max(cap, mincap);
            maxcap += cap;
        }

        while(mincap < maxcap){
            int mid =mincap +(maxcap - mincap)/2;
            int day = 1;
            int sum = 0;
            for(int weight : weights){
                if(sum + weight >mid ){
                    day++;
                    sum = 0;
                }
                sum += weight;
            }

            if(day > days){
                mincap = mid +1;
            }else{
                maxcap = mid;
            }
        }
        return mincap;
    }
}