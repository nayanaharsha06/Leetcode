class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(target == matrix[i][j]){
                return true;
            }else if(target > matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }return false;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i <arr.length ;i++){
            for(int j =0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
       
        Solution sol = new Solution();
         boolean result = sol.searchMatrix(arr, target);
        System.out.println(result);
    }
}

