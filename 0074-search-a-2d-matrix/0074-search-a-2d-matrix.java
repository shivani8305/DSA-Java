class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int num=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==target){
                    num=1;
                }
                if(num==1){
                    break;
                }

            }
            if (num==1){
                break;
            }
        }
        if(num==1){
            return true;
        }
        else{
            return false;
        }
    }
}