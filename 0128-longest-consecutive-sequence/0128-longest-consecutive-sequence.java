class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for (int num : nums) a.add(num);

        
        int result = 0;
        for(int num : nums) {
            int curr = 0;
            while(a.contains(num) && !a.contains(num+1)){
                curr++;
                a.remove(num);
                num--;
            }
            result = Math.max(curr, result);
        }
        return result;
        
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] p = Arrays.stream(s.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Solution sol = new Solution();
        int res = sol.longestConsecutive(p);
        System.out.println(res);
    }
}
