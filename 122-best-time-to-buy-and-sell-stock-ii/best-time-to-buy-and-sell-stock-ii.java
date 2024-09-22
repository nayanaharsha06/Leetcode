class Solution {
    public int maxProfit(int[] prices) {
        int curr = 0;
        int next = curr +1;
        int count = 0;
        while(next < prices.length){
            if(prices[next] > prices[curr]){
                count += prices[next] - prices[curr];
            }
            curr++;
            next++;
           
        } return count;
    }
}