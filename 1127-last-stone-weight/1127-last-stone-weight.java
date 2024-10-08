class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b -a);

        for(int i = 0; i < stones.length; i++){
            pq.add(stones[i]);
        }
        while(pq.size() > 1){
            int p1 = pq.poll();
            int p2 = pq.poll();
            if(p1 != p2){
                pq.add(p1 - p2);
            }
        }
        if(pq.size() == 0) return 0;
        return pq.poll();
    }
}