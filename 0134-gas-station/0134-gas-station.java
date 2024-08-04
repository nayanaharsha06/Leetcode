class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int total_cost = 0;
        int curr_gas = 0;
        int startIndex = 0;
       

        for(int i = 0; i < gas.length ; i++){
            total_gas += gas[i];
            total_cost += cost[i];
            curr_gas += gas[i] - cost[i];

            if(curr_gas < 0){
                startIndex = i + 1;
                curr_gas = 0;
            }
            
        }
        if (total_gas >= total_cost) {
                return startIndex;
            } 
        
        return -1;
    }
}