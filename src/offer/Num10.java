package offer;

/**
 * Created by Joe
 * 矩形覆盖
 */
public class Num10 {

    //思路：类似矩形覆盖
    public int RectCover(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        int first = 1;
        int next = 2;
        for (int i = 3; i <= target; i++) {
            next += first;
            first = next - first;
        }
        return next;
    }
}

