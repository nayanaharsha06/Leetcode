//https://www.youtube.com/watch?v=KVWXC-u9nSk

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0 ; i < prices.length ;i++){
            if(prices[i] < min){
                min = prices[i];
            }
                max = Math.max(max, prices[i] - min);
            
        
            
        }

        return max;
    }
}

