//https://www.youtube.com/watch?v=dgLypIfi9sk
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> a = new HashSet<>();

        for(int i = 0; i <9; i++){
            for(int j = 0; j<9 ; j++){
                char num = board[i][j];
                if(num != '.'){
                    if( !a.add(num + "at row" + i) ||
                       !a.add(num + "at col" + j) ||
                       !a.add(num + "at box" + i /3 + "," + j/3)){
                        return false;
                    }
                }
            }
        }return true;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] matrix  = new char[9][9];
        for(int i = 0; i< 9; i++){
            String line = sc.nextLine();
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        Solution sol = new Solution();
    }
}


/*add - returns a boolean , if we cannot add which means
 we have duplicate , then it is false
not of false is true ; so if statement is true hence inner thing will be excuted
If add returns true (indicating the value was added), !true becomes false.
If add returns false (indicating a duplicate), !false becomes true.
*/