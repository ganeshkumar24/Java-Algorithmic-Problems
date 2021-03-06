// https://leetcode.com/problems/diagonal-traverse/discuss/495382/JAVA-EASIEST-Solution-with-EXPLANATION!-(MUST-READ)
// 498
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int sol[] = new int[m * n];
        int row = 0, col = 0;
        for (int i = 0; i < sol.length; i++) {
            sol[i] = matrix[row][col];
            if ((row + col) % 2 == 0) {             
                if (col == n - 1) row++;           
                else if (row == 0) col++;       
                else { row--; col++;}           
            } else {                           
                if (row == m - 1) col++;           
                else if (col == 0) row++;        
                else { row++; col--;}          
            }
        }
        return sol;
    }
}