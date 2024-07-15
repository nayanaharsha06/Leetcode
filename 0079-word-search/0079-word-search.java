class Solution {
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        
        for(int i =0; i< board.length; i++){
            for(int j =0; j < board[0].length; j++){
                if(board[i][j] == arr[0] &&  func(board,i,j,0,arr) ){
                    return true;
                }
            }
        }
        
      return false;
        }
    
    public boolean func(char[][] board, int i , int j, int k, char[] arr){
        if (k == arr.length) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != arr[k]) {
            return false;

        }
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = func(board, i + 1, j, k + 1, arr) ||
                        func(board, i - 1, j, k + 1, arr) ||
                        func(board, i, j + 1, k + 1, arr) ||
                        func(board, i, j - 1, k + 1, arr);

        // unmark the board cell
        board[i][j] = temp;

        return found;

    }
}