package offer;

import java.util.Stack;

/**
 * Created by Joe
 * 栈的压入，弹出序列
 */
public class Num21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || pushA.length == 0) {
            return false;
        }
        int j = 0;
        //辅助栈
        Stack<Integer> help = new Stack<>();
        for (int i = 0; i < pushA.length; i++) {
            help.push(pushA[i]);
            while (!help.empty() && (help.peek() == popA[j])) {
                help.pop();
                j++;
            }
        }
        return help.empty();
    }
}
