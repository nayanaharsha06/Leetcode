class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr1 = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i < temperatures.length ; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                arr1[index] = i -index;
            }
            stack.push(i);
        }
        return arr1;
        
    }
}