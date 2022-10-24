// * accepted follwoing sol for 74.

import java.util.*;

public class TwoDArraySearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length - 1;

        int rStart = 0;

        while (rStart < row && col >= 0) {
            if (matrix[rStart][col] == target) {
                return true;
            } else if (matrix[rStart][col] > target) {
                col--;
            } else {
                rStart++;
            }
        }
        return false;
    }
}
