package offer;

import java.util.Stack;

/**
 * Created by Joe
 * 用两个栈实现队列
 */
public class Num5 {
    private static Stack<Integer> inStack = new Stack<>();
    private static Stack<Integer> outStack = new Stack<>();
    public void push(int node) {
        inStack.push(node);
    }
    public int pop() throws Exception {
        if (inStack.empty() && outStack.empty()) {
            throw new Exception("queue is empty");
        }
        if (outStack.empty()) {
            while (!inStack.empty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}
