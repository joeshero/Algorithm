package offer;

/**
 * Created by Joe
 * 数值的整数次方
 */
public class Num12 {

    public double Power(double base, int exponent) {
        //指数为0或负数时base不能为0
        if (base == 0 && exponent <= 0) {
            throw new IllegalArgumentException();
        }
        //处理指数为0情况
        if (exponent == 0) {
            return 1;
        }
        //判断指数正负
        boolean tag = (exponent > 0) ;
        //将指数变为正数计算
        exponent = exponent > 0 ? exponent : -exponent;
        //利用位运算
        double pow = 1;
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                pow *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        return tag ? pow : 1 / pow;
    }

}
