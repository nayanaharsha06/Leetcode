class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
                st.push(arr[i]);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char a = st.pop();        
                if(!((a == '(' && arr[i] ==')' ) ||
                   (a == '{' && arr[i] == '}') || 
                   (a == '[' && arr[i] == ']'))){
                        return false;
                    }
                }
            } return st.isEmpty();
        }
}
