class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        backtrack(arr,"",0,0,n);
        return arr;
    }
    public void backtrack(List<String> arr, String curr,int open, int close, int max){
        if(curr.length() == max*2){
            arr.add(curr);
            return;
        }

        if(open<max) backtrack(arr, curr + "(", open + 1,close,max);
        if(open > close) backtrack(arr, curr + ")",open, close + 1,max);

    }
}
