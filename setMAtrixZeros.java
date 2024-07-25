class Solution {

   
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

       boolean fRow = false;
       boolean fCol = false;

       for(int i=0;i<row;i++) {
        if(matrix[i][0] == 0) {
             fCol = true;
            break; 
        }
       }

       for(int i=0;i<col;i++) {
        if(matrix[0][i] == 0) {
            fRow = true;
            break; 
        }
       }

       for(int i=1;i<row;i++) {
        for(int j=1;j<col;j++) {
            if(matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
       }
        for(int i=1;i<row;i++) {
            if(matrix[i][0] == 0) Arrays.fill(matrix[i],0);
        }

        for(int j=1;j<col;j++) {
            if(matrix[0][j] == 0) {
                for(int i=0;i<row;i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(fCol) {
            for(int j=0;j<row;j++) {
                matrix[j][0] = 0;
            }
        }

        if(fRow) Arrays.fill(matrix[0],0);
        

       
    }
}
