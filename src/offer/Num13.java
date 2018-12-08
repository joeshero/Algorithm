package offer;

import java.util.Arrays;

/**
 * Created by Joe
 * 调整数组顺序使奇数位于偶数前面
 * 1,2,3,4,5,6,7
 */
public class Num13 {

    //方法一：利用辅助数组
    public void reOrderArray1(int [] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        //统计奇数个数
        int count = 0;
        for (int num : array) {
            if (num % 2 == 1) {
                count++;
            }
        }
        //构建辅助数组,浅拷贝
        int[] help = array.clone();
        //奇数指针
        int i = 0;
        //偶数指针
        int j = count;
        for (int num : help) {
            if (num % 2 == 1) {
                array[i++] = num;
            }else {
                array[j++] = num;
            }
        }

    }

    //方法二：类似冒泡排序，每次循环交换相邻位置奇偶顺序
    public void reOrderArray2(int [] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
