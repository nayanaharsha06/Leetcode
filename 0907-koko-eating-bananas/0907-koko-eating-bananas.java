//https://www.youtube.com/watch?v=JGYXNpZaW2U//
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        while(low<high){
            int mid= (low+high) / 2;
            int sum =0;
            for(int i = 0; i< piles.length ; i++){
                sum += Math.ceil((double)piles[i]/mid);
            }
            if(sum<= h){
                high = mid;
            }else{
                low = mid +1;
            }
       }return low;
        
    }
}