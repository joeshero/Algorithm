# Algorithm

[剑指offer](#剑指offer)

[Leetcode](#Leetcode)

# 剑指offer

- [1.二维数组的查找](#1-二维数组的查找)
- [2.替换空格](#2-替换空格)
- [3.从尾到头打印链表](#3-从尾到头打印链表)
- [4.重建二叉树](#4-重建二叉树)
- [5.用两个栈实现队列](#5-用两个栈实现队列)
- [6.旋转数组的最小值](#6-旋转数组的最小值)
- [7.斐波那契数列](#7-斐波那契数列)
- [8.跳台阶](#8-跳台阶)
- [9.变态跳台阶](#9-变态跳台阶)
- [10.矩形覆盖](#10-矩形覆盖)
- [11.二进制中1的个数](#11-二进制中1的个数)

## 1. 二维数组的查找

**题目描述**

在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

```java
//思路：从右上角开始找

//时间复杂度 O(M+N)+O(1)
public boolean Find(int target, int [][] array) {
    if (array == null || array.length == 0 || array[0].length == 0) {
        return false;
    }
    int i = 0;
    int j = array[0].length - 1;
    while (i <= array.length - 1 && j >= 0) {
        if (target > array[i][j]) {
           i++;
        } else if (target < array[i][j]) {
            j--;
        }else{
            return true;
        }
    }
    return false;
}
```

## 2. 替换空格

**题目描述**

请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

```java
//思路：利用StringBuilder，遍历str，遇到空格进行替换
public String replaceSpace(StringBuffer str) {
    if (str == null || str.length() == 0) {
        return str.toString();
    }
    int len = 0;
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ') {
            stringBuilder.append("%20");
            continue;
        }
        stringBuilder.append(str.charAt(i));
    }

    return stringBuilder.toString();

}
```

## 3. 从尾到头打印链表

**题目描述**

输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

```java
//思路一：利用递归
//思路二：遍历listNode保存在栈中
//思路三：头插法
public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    if (listNode == null) {
        return new ArrayList<>();
    }
    ArrayList<Integer> vals = new ArrayList<>();
    vals.addAll(printListFromTailToHead(listNode.next));
    vals.add(listNode.val);
    return vals;
}
```

## 4. 重建二叉树

**题目描述**

输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

```java
//思路：递归求解
//取前序遍历的第一个元素为根节点，遍历中序遍历将数组分为两部分进行递归
public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
    if (pre == null || pre.length == 0 || in == null || in.length == 0) {
        return null;
    }
    TreeNode node = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    return node;
}

public TreeNode reConstructBinaryTree(int[] pre, int pl, int pr, int[] in, int il, int ir) {
    if (pl > pr || il > ir) {
        return null;
    }
    TreeNode root = new TreeNode(pre[pl]);

    for (int i = il; i <= ir; i++) {
        if (in[i] == pre[pl]) {
            root.left = reConstructBinaryTree(pre, pl + 1, pl + i - il, in, il, i - 1);
            root.right = reConstructBinaryTree(pre, pl + i + 1 - il, pr, in, i + 1, ir);
            break;
        }
    }
    return root;
}
```

## 5. 用两个栈实现队列

**题目描述**

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

```java
//思路：两个栈，一个栈负责入队，一个栈负责出队
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
```

## 6. 旋转数组的最小值

**题目描述**

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。   输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。  例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。   NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

```java
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
```

## 7. 斐波那契数列

**题目描述**

大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 

  n<=39 

```java
//思路：采用非递归形式
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
```

## 8. 跳台阶

**题目描述**

一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

```java
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
```

## 9. 变态跳台阶

**题目描述**

一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

```java
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
//累加前n-1项
private int merge(int[] arr, int end) {
    int sum = 0;
    for (int i = 0; i <= end; i++) {
        sum += arr[i];
    }
    return sum;
}
```

## 10. 矩形覆盖

**题目描述**

我们可以用2 * 1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2 * 1的小矩形无重叠地覆盖一个2 * n的大矩形，总共有多少种方法？

```java
//思路：类似斐波那契数列
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
```

## 11. 二进制中1的个数

```java
//方法一：位运算，每次判断n最后一位是否为1，再无符号右移一位计算
public int NumberOf1(int n) {

    int count = 0;

    while (n != 0) {
        if ((n & 1) == 1) {
            count++;
        }
        n >>= 1;
    }
    return count;
}
```

```Java
//方法二：位运算，当n不为0时，将n最后一位1置0（n&(n-1)），再次运算
public int NumberOf1(int n) {

    int count = 0;

    while (n != 0) {
        count++;
        n = n & (n - 1);
    }
    return count;
}
```

# Leetcode

- [1.两数之和](#1-两数之和)

## 1. 两数之和

[two sum](https://leetcode-cn.com/problems/add-two-numbers/)

```java
//思路：利用HashMap
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int a = target - nums[i];
        if (map.containsKey(a)) {
            return new int[]{i, map.get(a)};
        }
        map.put(nums[i], i);


    }
    return new int[]{};
}
```

