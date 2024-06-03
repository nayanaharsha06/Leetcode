class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< speed.length ; i++){
            map.put(position[i],speed[i]);
        }        
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        tree.putAll(map);
        int pointr = 0;
        double[] time = new double[speed.length];
        for(Map.Entry<Integer,Integer> entry : tree.entrySet()){
            time[pointr] = (double)(target - entry.getKey())/entry.getValue();
            pointr++;

        }
        Stack<Double> stk = new Stack<>();
        for(int i = time.length-1; i >=0;i--){
            if(stk.empty()){
                stk.push(time[i]);
            }
            if(time[i]>stk.peek()){
                stk.push(time[i]);
            }
        }
        return stk.size();

    }
}