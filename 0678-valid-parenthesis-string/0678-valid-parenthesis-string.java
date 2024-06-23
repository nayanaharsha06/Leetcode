class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> star = new Stack<>();
        Stack<Integer> open_b = new Stack<>();
        
        for(int i =0; i <s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                open_b.push(i);
            }else if(c == '*'){
                star.push(i);
            }else if(c == ')'){
                if(open_b.isEmpty()){
                    if(star.isEmpty()){
                        return false;
                    }else{
                        star.pop();
                    }
                }else if(!open_b.isEmpty()){
                    open_b.pop();
                }
            }
        }
        while (!open_b.isEmpty() && !star.isEmpty()) {
            if (open_b.pop() > star.pop()) {
                return false;
            }
        }
        return open_b.isEmpty();
    }
}