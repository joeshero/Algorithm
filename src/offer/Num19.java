package offer;

import java.util.ArrayList;

/**
 * Created by Joe
 * 顺时针打印矩阵
 */
public class Num19 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> vals = new ArrayList<>();
        int row1 = 0;
        int col1 = 0;
        int row2 = matrix.length - 1;
        int col2 = matrix[0].length - 1;
        while (row1 < row2 && col1 < col2) {
            //从左到右遍历
            for (int i = col1; i < col2; i++) {
                vals.add(matrix[row1][i]);
            }
            //从上到下遍历
            for (int i = row1; i < row2; i++) {
                vals.add(matrix[i][col2]);
            }
            //从右到左遍历
            for (int i = col2; i > col1; i--) {
                vals.add(matrix[row2][i]);
            }
            //从下到上遍历
            for (int i = row2; i > row1; i--) {
                vals.add(matrix[i][col1]);
            }
            row1++;
            col1++;
            row2--;
            col2--;
        }
        if (row1 == row2) {
            for (int i = col1; i <= col2; i++) {
                vals.add(matrix[row1][i]);

            }
            return vals;
        }

        if (col1 == col2) {
            for (int i = row1; i <= row2; i++) {
                vals.add(matrix[i][col1]);
            }
        }
        return vals;
    }

    public static void main(String[] args) {
        int[][] test = {
                {1,2,3},

        };
        Num19 num = new Num19();
        ArrayList<Integer> sdv = num.printMatrix(test);
        System.out.println(sdv);
    }
}
