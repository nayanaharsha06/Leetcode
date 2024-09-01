class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        if(numRows == 1){
            arr.add(new ArrayList<>(Arrays.asList(1)));
            return arr;
        }

        arr.add(new ArrayList<>(Arrays.asList(1)));
        List<Integer> prev = new ArrayList<>(Arrays.asList(1,1));
        arr.add(prev);

        for(int i = 3; i <= numRows ; i++){
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for(int j = 0 ; j < prev.size()-1; j++){
                int val = prev.get(j)+prev.get(j+1);
                next.add(val);
            }
            next.add(1);
            arr.add(next);
            prev = next;
        }
        
        return arr;
    }
}