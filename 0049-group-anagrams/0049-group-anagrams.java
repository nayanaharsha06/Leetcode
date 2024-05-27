class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedstr = String.valueOf(charArray);
            if(!groupedAnagrams.containsKey(sortedstr)){
                groupedAnagrams.put(sortedstr, new ArrayList<>());
            }

            groupedAnagrams.get(sortedstr).add(str);
        }
        return new ArrayList<>(groupedAnagrams.values());
        
    }
}