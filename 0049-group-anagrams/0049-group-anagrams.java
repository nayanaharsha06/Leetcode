class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> a = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!a.containsKey(sorted)){
                a.put(sorted, new ArrayList<>());
            }
            a.get(sorted).add(str);

        }
        return new ArrayList<>(a.values());
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] p = input.split("\\s+");
        Solution sol = new Solution();
        List<List<String>> res = sol.groupAnagrams(p);
        //for(List<String> s : res){
          //  System.out.println(s);
        //}
    }
}
