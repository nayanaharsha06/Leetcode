//https://www.youtube.com/watch?v=tSRFtR3pv74&t=312s
import java.util.*;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] left = new int[l];
        int[] right = new int[l];

        left[0]=1;
        right[l-1] = 1;
        for(int i = 1; i < l; i++){
            left[i] = left[i-1] * nums[i-1];
        } 
        for(int j = l-2; j  >=0; j--){
            right[j] = right[j+1] * nums[j+1];
        }   
        int[] ans = new int[l];
        for(int i =0; i <l ; i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] p = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Solution sol = new Solution();
        int[] result = sol.productExceptSelf(p);

        System.out.println(Arrays.toString(result));
        
    }
}
