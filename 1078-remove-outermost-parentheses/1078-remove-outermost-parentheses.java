class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch =='('){
                //// Only append '(' if the stack 
                //is not empty (i.e., not an outer parenthesis)
                if(stack.size() > 0){
                    str.append(ch);
                }
                stack.push(ch);
            }else{
                stack.pop();
                // Remove the corresponding '(' from the stack
                // Only append ')' if the stack is not empty (i.e., not an outer parenthesis)
                if(stack.size() > 0){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}