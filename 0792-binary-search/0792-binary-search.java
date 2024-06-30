class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while(low<=high){
            int middle = (low+high)/2;
            if(nums[middle] == target){
                return middle;
            }else if( nums[middle] < target){
                low = middle+1;
            }else{
                high = middle - 1;
            }
        }
        return -1;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] p = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = sc.nextInt();
        Solution sol = new Solution();
        int s = sol.search(p,target);
        System.out.println(s);
    }
}

