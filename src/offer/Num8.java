package offer;

/**
 * Created by Joe
 * 跳台阶
 */
public class Num8 {
    //思路：斐波那契数列，动态规划
    public int JumpFloor(int target) {
        if (target <= 0) {
            return -1;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= target; i++) {
            second += first;
            first = second - first;
        }
        return second;
    }
}
