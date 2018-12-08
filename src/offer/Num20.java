package offer;

import java.util.Stack;

/**
 * Created by Joe
 * 包含min函数的栈
 */
public class Num20 {

    private static Stack<Integer> myStack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();


    public void push(int node) {
        myStack.push(node);
        if (minStack.empty()) {
            minStack.push(node);
        }
        minStack.push(minStack.peek() <= node ? minStack.peek() : node);
    }

    public void pop() {
        if (!myStack.empty()) {
            myStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (!myStack.empty()) {
            return myStack.peek();
        }

        throw new IndexOutOfBoundsException();

    }

    public int min() {
        if (!minStack.empty()) {
            return minStack.peek();
        }

        throw new IndexOutOfBoundsException();
    }
}
