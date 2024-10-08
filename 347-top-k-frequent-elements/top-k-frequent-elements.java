class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>  map  = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for(Map.Entry entry : map.entrySet()){
            pq.add(entry);
        }

        int[] arr = new int[k];
        for(int i = 0 ; i < k; i++){
            arr[i] = pq.poll().getKey();
        }

        return arr;
         
    }      
}

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int k = sc.nextInt();
        int[] a = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Solution sol = new Solution();
        int[] topK = sol.topKFrequent(a, k);
        System.out.println(Arrays.toString(topK)); //withput arrays.toString method we will get hashcode anf not array values
    }
}