package offer;

/**
 * Created by Joe
 * 变态跳台阶
 */
public class Num9 {

    //思路：动态规划
    public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        int[] dp = new int[target + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= target; i++) {
            dp[i] = merge(dp, i - 1) + 1;
        }
        return dp[target];

    }

    private int merge(int[] arr, int end) {
        int sum = 0;
        for (int i = 0; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
