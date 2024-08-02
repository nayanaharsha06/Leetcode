//https://www.youtube.com/watch?v=qy3kjvlZLpc&t=608s
class TimeMap {
    HashMap<String, List<Pair<String,Integer>>> map;
    //map could look like this: {"foo": [(bar, 1), (bar2, 4)]}

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        // If key is "foo", and there are no previous records, it creates a new empty list.
        map.get(key).add(new Pair(value, timestamp));
        //Adds the new pair to the list.
        //Example: If the list was empty, after adding, it will contain [(bar, 1)].
    }
    
    public String get(String key, int timestamp) {
        String res = "";
        if(map.containsKey(key)){
            List<Pair<String, Integer>> temp = map.get(key);
            int left =0 ;
            int right = temp.size() -1;
            while(left <= right){
                int mid = (left+ right) /2;
                if(temp.get(mid).getValue() <= timestamp){
                    res = temp.get(mid).getKey();
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }

            }return res;
        }
        return "";
    }
}

/*  tht list is itself acting like key and value pair 
Each entry in the list associated with a key is a Pair, where:
The first element (Pair.getKey()) is a timestamp (String).
The second element (Pair.getValue()) is an integer value.
 */
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */