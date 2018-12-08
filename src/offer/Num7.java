package offer;

/**
 * Created by Joe
 * 斐波那契数列
 */
public class Num7 {

    public int Fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        int first = 0;
        int next = 1;
        for (int i = 2; i <= n; i++) {
            next += first;
            first = next - first;
        }
        return next;
    }
}
