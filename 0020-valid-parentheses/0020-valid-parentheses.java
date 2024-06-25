class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length ; i++){
            char x = arr[i];
            if(x == '(' || x =='{' || x =='['){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char y = stack.pop();
                if((x == ')' && y != '(') || (x == '}' && y != '{') || (x == ']' && y != '[')){
                    return false;
                }
            }
        }return stack.isEmpty();
    }
}