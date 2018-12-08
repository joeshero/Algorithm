package offer;

/**
 * Created by Joe
 * 旋转数组的最小值
 */
public class Num6 {

    //思路：利用二分搜索法
    //如果出现相等情况，采用遍历
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (array[mid] == array[lo] && array[mid] == array[hi]) {
                return search(array);
            }
            if (array[mid] >= array[lo]) {
                lo = mid;
            } else if (array[mid] <= array[hi]) {
                hi = mid;
            }
            if (hi - lo <= 1) {
                break;
            }
        }
        return array[hi];

    }

    private int search(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
