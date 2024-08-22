//https://www.youtube.com/watch?v=e22ns5G0qKY
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 0 ; i <  nums.length ; i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                count++;
            }
            if(count > 1) return false;
        }

        return true;
    }
}

// we are checking if a[i+1] > a[i] , it should be true in one case 
//only when count is 1 , if we put condition as a[i+1] >a[i] 
//index will be out of bounds so we are using nums[(i+1)% nums.length] 
//The expression (i+1) % nums.length ensures that the index wraps around to 
//the beginning of the array when it reaches the end (i.e., it handles the
// circular nature of the array).