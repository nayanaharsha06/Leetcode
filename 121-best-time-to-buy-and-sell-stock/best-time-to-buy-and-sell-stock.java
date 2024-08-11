//https://www.youtube.com/watch?v=KVWXC-u9nSk

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }else {
                maxPrice =Math.max(prices[i] - minPrice, maxPrice); 
            }
        }
        return maxPrice;
    }
}