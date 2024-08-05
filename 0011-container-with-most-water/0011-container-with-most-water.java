class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length -1;
        int max =0;
        while(a < b){
            if(height[a] < height[b]){
                max = Math.max(height[a] * (b-a),max);
                a++; 
            }else{
                max = Math.max(height[b]*(b-a),max);
                b--; 
            }
        }return max;
}
}
