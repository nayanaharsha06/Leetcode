class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> a = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            int diff = target - nums[i];
            if(a.containsKey(diff)){
                return new int[]{a.get(diff),i};
            }
            a.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum Solution");
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] p = Arrays.stream(input.split("//s+")).mapToInt(Integer::parseInt).toArray();
        int target = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.twoSum(p,target));
    }
}
