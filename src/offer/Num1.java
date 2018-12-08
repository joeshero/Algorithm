package offer;

/**
 * Created by Joe
 * 二维数组的查找
 * 思路：从右上角开始找
 */
public class Num1 {

    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while (i <= array.length - 1 && j >= 0) {
            if (target > array[i][j]) {
               i++;
            } else if (target < array[i][j]) {
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
}
