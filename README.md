# Algorithm

[剑指offer](#剑指offer)

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
- [12.数值的整数次方](#12-数值的整数次方)
- [13.调整数组顺序使奇数位于偶数前面](#13-调整数组顺序使奇数位于偶数前面)
- [14.链表中倒数第k个结点](#14-链表中倒数第k个结点)
- [15.反转链表](#15-反转链表)
- [16.合并两个排序的列表](#16-合并两个排序的列表)
- [17.树的子结构](#17-树的子结构)
- [18.二叉树的镜像](#18-二叉树的镜像)
- [19.顺时针打印矩阵](#19-顺时针打印矩阵)
- [20.包含min函数的栈](#20-包含min函数的栈)
- [21.栈的压入，弹出序列](#21-栈的压入，弹出序列)
- [22.从上往下打印二叉树](#22-从上往下打印二叉树)
- [23.二叉树的后序遍历序列](#23-二叉树的后序遍历序列)
- [24.二叉树中和为某一值的路径](#24-二叉树中和为某一值的路径)
- [25.复杂链表的复制](#25-复杂链表的复制)
- [26.二叉搜索树与双向链表](#26-二叉搜索树与双向链表)
- [27.字符串的排列](#27-字符串的排列 )
- [28.数组中出现次数超过一半的数字](#28-数组中出现次数超过一半的数字)
- [29.最小的k个数](#29-最小的k个数)
- [30.连续子数组的最大和](#30-连续子数组的最大和)
- [31.整数中1出现的次数](#31-整数中1出现的次数)
- [32.把数组排成最小的数](#32-把数组排成最小的数)
- [33.丑数](#33-丑数)
- [34.第一次只出现一次的字符](#34-第一次只出现一次的字符)
- [35.数组中的逆序对](#35-数组中的逆序对)
- [36.两个链表的第一个公共结点](#36-两个链表的第一个公共结点)
- [37.数字在排序数组中出现的次数](#37-数字在排序数组中出现的次数)
- [38.二叉树的深度](#38-二叉树的深度)
- [39.平衡二叉树](#39-平衡二叉树)
- [40.数组中只出现一次的数字](#40-数组中只出现一次的数字)
- [41.和为S的连续正数序列](#41-和为S的连续正数序列)
- [42.和为S的两个数字](#42-和为S的两个数字)
- [43.左旋转字符串](#43-左旋转字符串)
- [44.翻转单词顺序列](#44-翻转单词顺序列)
- [45.扑克牌顺子](#45-扑克牌顺子)
- [46.孩子们的游戏](#46-孩子们的游戏)
- [47.求1+2+...+n](#47-求1+2+...+n)
- [48.不用加减乘除做加法](#48-不用加减乘除做加法)
- [49.把字符串转换为整数](#49-把字符串转换为整数)
- [50.数组中重复的数字](#50-数组中重复的数字)
- [51.构建乘积数组](#51-构建乘积数组)
- [52.正则表达式匹配](#52-正则表达式匹配)
- [53.表示数值的字符串](#53-表示数值的字符串)
- [54.字符流中第一个不重复的字符](#54-字符流中第一个不重复的字符)
- [55.链表中环的入口结点](#55-链表中环的入口结点)
- [56.删除链表中重复的结点](#56-删除链表中重复的结点)
- [57.二叉树的下一个结点](#57-二叉树的下一个结点)
- [58.对称的二叉树](#58-对称的二叉树)
- [59.按之字形顺序打印二叉树](#59-按之字形顺序打印二叉树)
- [60.把二叉树打印成多行](#60-把二叉树打印成多行)
- [61.序列化二叉树](#61-序列化二叉树)
- [62.二叉搜索数的第k个结点](#62-二叉搜索树的第k个结点)
- [63.数据流中的中位数](#63-数据流中的中位数)
- [64.滑动窗口的最大值](#64-滑动窗口的最大值)
- [65.矩阵中的路径](#65-矩阵中的路径)
- [66.机器人的运动范围](#66-机器人的运动范围)

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

**题目描述**

输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

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

## 12. 数值的整数次方

**题目描述**

给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

```java
//注意特殊情况，运算时采用位运算
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
```

## 13. 调整数组顺序使奇数位于偶数前面

**题目描述**

输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

```java
//方法一：类似冒泡排序，每次循环交换相邻位置奇偶顺序
public void reOrderArray(int [] array) {
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
```

```java
//方法二：利用辅助数组
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
```

## 14. 链表中倒数第k个结点

**题目描述**

输入一个链表，输出该链表中倒数第k个结点。

```java
//思路：利用两个指针，一个指针先走k步，再与另一个指针共同前进，当快指针指向null，慢指针即指向倒数第k个结点
public ListNode FindKthToTail(ListNode head,int k) {
    //处理特值
    if (k <= 0) {
        return null;
    }
    //让快指针先走k步，如果提前到达null，说明链表长度小于k，返回null
    ListNode fast = head;
    while (k-- > 0) {
        if (fast == null) {
            return null;
        }
        fast = fast.next;
    }
    ListNode low = head;
    while (fast != null) {
        low = low.next;
        fast = fast.next;
    }
    return low;

}
```

## 15. 反转链表

**题目描述**

输入一个链表，反转链表后，输出新链表的表头。

```java
//迭代，利用头插法
public ListNode ReverseList(ListNode head) {
    //处理特殊情况
    if (head == null || head.next == null) {
        return head;
    }

    //头插法
    ListNode node = new ListNode(0);
    while (head != null) {
        ListNode p = head.next;
        head.next = node.next;
        node.next = head;
        head = p;
    }
    return node.next;

}
```

```java
//递归
public ListNode ReverseList(ListNode head) {
    //递归中止条件
    if (head == null || head.next == null) {
        return head;
    }

    ListNode node = ReverseList(head.next);
    head.next.next = head;
    head.next = null;
    return node;
}
```

## 16. 合并两个排序的列表

**题目描述**

输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

```java
//方法一：递归
public ListNode Merge(ListNode list1,ListNode list2) {
    if (list1 == null && list2 == null) {
        return null;
    }
    if (list1 == null) {
        return list2;
    }
    if (list2 == null) {
        return list1;
    }

    ListNode node = new ListNode(-1);
    ListNode p = node;
    if (list2.val >= list1.val) {
        p.next = list1;
        list1 = list1.next;
    } else {
        p.next = list2;
        list2 = list2.next;
    }
    p = p.next;
    p.next = Merge(list1, list2);
    return node.next;
    
}
```



```java
//方法二：迭代法
public ListNode Merge(ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null) {
        return null;
    }
    if (list1 == null) {
        return list2;
    }
    if (list2 == null) {
        return list1;
    }
    ListNode node = new ListNode(-1);
    ListNode p = node;
    while (list1 != null && list2 != null) {
        if (list1.val >= list2.val) {
            p.next = list2;
            list2 = list2.next;
        } else {
            p.next = list1;
            list1 = list1.next;
        }
        p = p.next;
    }
    if (list1 != null) {
        p.next = list1;
    }
    if (list2 != null) {
        p.next = list2;
    }
    return node.next;
}
```

## 17. 树的子结构

**题目描述**

输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

```java
//递归
public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    boolean result = false;
    //都不为空才能判断
    if (root1 != null && root2 != null) {
        //如果根节点相等，依次比较每个节点
        if (root1.val == root2.val) {
            result = isTree1HavaTree2(root1, root2);
        }
        //如果不匹配，在左子树匹配
        if (!result) {
            result = HasSubtree(root1.left, root2);
        }
        //如果不匹配，在右子树匹配
        if (!result) {
            result = HasSubtree(root1.right, root2);
        }
    }
    return result;

}

private boolean isTree1HavaTree2(TreeNode node1, TreeNode node2) {
    //如果tree2遍历完了说明每个节点都符合，返回true
    //两个if顺序不能颠倒
    if (node2 == null) {
        return true;
    }
    //如果tree2没遍历完tree1遍历完了，说明不符合，返回false
    if (node1 == null) {
        return false;
    }
    //其中一个点没对上
    if (node1.val != node2.val) {
        return false;
    }
    return isTree1HavaTree2(node1.left, node2.left) && isTree1HavaTree2(node1.right, node2.right);
}
```

## 18. 二叉树的镜像

**题目描述**

操作给定的二叉树，将其变换为源二叉树的镜像。

**输入描述**:

```
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
```

```java
//自下而上递归
public void Mirror1(TreeNode root) {
    if (root == null) {
        return;
    }

    Mirror1(root.left);
    Mirror1(root.right);
    swap(root);
}

public void swap(TreeNode node) {
    if (node.left == null || node.right == null) {
        return;
    }
    TreeNode p = node.left;
    node.left = node.right;
    node.right = p;
}

//自上而下递归
public void Mirror(TreeNode root) {
    if (root == null) {
        return;
    }
    swap(root);
    Mirror(root.left);
    Mirror(root.right);
}
```

## 19. 顺时针打印矩阵

**题目描述**

输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4  X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16  则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

```java
//思路：注意在遍历过程中只剩一行或者一列的情况，防止重复打印
public ArrayList<Integer> printMatrix(int [][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return new ArrayList<>();
    }
    ArrayList<Integer> vals = new ArrayList<>();
    int row1 = 0;
    int col1 = 0;
    int row2 = matrix.length - 1;
    int col2 = matrix[0].length - 1;
    while (row1 < row2 && col1 < col2) {
        //从左到右遍历
        for (int i = col1; i < col2; i++) {
            vals.add(matrix[row1][i]);
        }
        //从上到下遍历
        for (int i = row1; i < row2; i++) {
            vals.add(matrix[i][col2]);
        }
        //从右到左遍历
        for (int i = col2; i > col1; i--) {
            vals.add(matrix[row2][i]);
        }
        //从下到上遍历
        for (int i = row2; i > row1; i--) {
            vals.add(matrix[i][col1]);
        }
        row1++;
        col1++;
        row2--;
        col2--;
    }
    if (row1 == row2) {
        for (int i = col1; i <= col2; i++) {
            vals.add(matrix[row1][i]);

        }
        return vals;
    }

    if (col1 == col2) {
        for (int i = row1; i <= row2; i++) {
            vals.add(matrix[i][col1]);
        }
    }
    return vals;
}
```



## 20. 包含min函数的栈

**题目描述**

定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。

```java
//思路：利用一个辅助栈保存每次push时栈中最小元素，当小于栈顶元素时压入该元素，否则压入原来栈顶元素。pop操作时与主栈同步弹出。
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
```

## 21. 栈的压入，弹出序列

**题目描述**

输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

```java
//思路：利用辅助栈模拟压栈过程
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
```

## 22. 从上往下打印二叉树

**题目描述**

从上往下打印出二叉树的每个节点，同层节点从左至右打印。

```java
//思路：利用队列层序遍历二叉树
public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    if (root == null) {
        return new ArrayList<>();
    }
    ArrayList<Integer> vals = new ArrayList<>();
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.offer(root);
    while (!nodes.isEmpty()) {
        TreeNode node = nodes.poll();
        vals.add(node.val);
        if (node.left != null) {
            nodes.offer(node.left);
        }
        if (node.right != null) {
            nodes.offer(node.right);
        }
    }
    return vals;
}
```

## 23. 二叉树的后序遍历序列

**题目描述**

输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

```java
//非递归 
//非递归也是一个基于递归的思想：
//左子树一定比右子树小，因此去掉根后，数字分为left，right两部分，right部分的
//最后一个数字是右子树的根他也比左子树所有值大，因此我们可以每次只看有子树是否符合条件
//即可，即使到达了左子树左子树也可以看出由左右子树组成的树还想右子树那样处理
 
//对于左子树回到了原问题，对于右子树，左子树的所有值都比右子树的根小可以暂时把他看出右子树的左子树
//只需看看右子树的右子树是否符合要求即可
public boolean VerifySquenceOfBST(int [] sequence) {
    int size = sequence.length;
    if (size == 0) {
        return false;
    }
    int i = 0;
    while (--size > 0) {
        while (sequence[i] < sequence[size])i++;
        while (sequence[i] > sequence[size])i++;
        if (i < size) {
            return false;
        }
        i = 0;
    }
    return true;
}
```

## 24. 二叉树中和为某一值的路径

**题目描述**

输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。

```java
package offer;

import java.util.ArrayList;

/**
 * Created by Joe
 * 二叉树中和为某一值的路径
 */
public class Num24 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        getPath(paths, path, root, target);
        return paths;
    }

    private void getPath(ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path, TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            paths.add(new ArrayList<>(path));
        }
        getPath(paths, path, root.left, target);
        getPath(paths,path,root.right,target);
        //每次遍历到叶子节点需要回退到父节点遍历其他节点
        //此时要把叶子节点移除
        path.remove(path.size() - 1);

    }
}
```

## 25. 复杂链表的复制

**题目描述**

输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

```java
//思路：节点复制，拷贝随机节点，再拆分
public RandomListNode Clone(RandomListNode pHead) {
    if (pHead == null) {
        return null;
    }
    RandomListNode p = pHead;
    //在每个节点后面复制节点
    while (p != null) {
        RandomListNode clone = new RandomListNode(p.label);
        clone.next = p.next;
        p.next = clone;
        p = p.next.next;
    }

    //调整random指针
    p = pHead;
    while (p != null) {
        RandomListNode node = p.next;
        if (p.random != null) {
            node.random = p.random.next;
        }
        p = p.next.next;
    }

    //拆分
    //要返回的节点
    RandomListNode newHead = pHead.next;
    p = pHead;
    while (p.next != null) {
        RandomListNode cur = p.next;
        p.next = cur.next;
        p = cur;
    }
    return newHead;

}
```

## 26. 二叉搜索树与双向链表

**题目描述**

输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

```java
public TreeNode Convert(TreeNode pRootOfTree) {
    if (pRootOfTree == null) {
        return null;
    }
    
    TreeNode p = pRootOfTree;
    //要返回的节点
    TreeNode root = null;
    //保存当前节点之前节点
    TreeNode pre = null;
    boolean tag = true;
    Stack<TreeNode> nodes = new Stack<>();
    while (p != null || !nodes.empty()) {
        //将当前节点及左子树放入栈中
        while (p != null) {
            nodes.push(p);
            p = p.left;
        }
        p = nodes.pop();
        //取出栈中元素进行操作
        //此时该元素为栈中最小元素
        if (tag) {
            //第一次取出，该元素为链表头部
            root = p;
            //保存当前节点
            pre = p;
            tag = false;
        }else{
            p.left = pre;
            pre.right = p;
            pre = p;
        }
        p = p.right;
    }

    return root;
}
```

## 27. 字符串的排列

**题目描述**

输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符

串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

```java
//思路：回溯法
public ArrayList<String> Permutation(String str) {
    if (str == null || str.length() == 0) {
        return new ArrayList<>();
    }
    ArrayList<String> result = new ArrayList<>();
    char[] ch = str.toCharArray();
    find(ch, result, 0);
    Collections.sort(result);
    return result;
}

private void find(char[] ch, ArrayList<String> result, int i) {
    //递归终止条件
    if (i == ch.length - 1) {

        if (!result.contains(new String(ch))) {
            result.add(new String(ch));
            return;
        }
    } else {

        for (int j = i; j < ch.length; j++) {
            swap(ch, i, j);
            find(ch, result, i + 1);
            swap(ch, i, j);
        }


    }
}

private void swap(char[] ch, int i, int j) {
    if (i != j) {
        char tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;
    }
}
```

## 28. 数组中出现次数超过一半的数字

**题目描述**

数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

```java
//num保存当前数组中数字，count统计次数，遍历数组，后面数字与num相等count++，否则--,当count为0时num为当前数组数字。
//这样会统计出当前数组中出现次数最多的数字。再次遍历数组验证其出现次数是否超过一半
public int MoreThanHalfNum_Solution(int[] array) {
    if (array == null || array.length == 0) {
        return 0;
    }

    int num = array[0];
    int count = 1;
    for (int i = 1; i < array.length; i++) {
        if (array[i] == num) {
            count++;
        } else {
            count--;
        }
        if (count == 0) {
            num = array[i];
            count = 1;
        }
    }
    count = 0;
    for (int i = 0; i < array.length; i++) {
        if (num == array[i]) {
            count++;
        }
    }

    return count > array.length / 2 ? num : 0;
}
```

## 29. 最小的k个数

**题目描述**

输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

```java
//思路：冒泡排序只排序k次
public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
    if (input == null || input.length == 0 || k <= 0 || k > input.length) {
        return new ArrayList<>();
    }
    List<Integer> vals = new ArrayList<>();
    for (int i = 0; i < k; i++) {
        for (int j = input.length - 1; j > i; j--) {
            if (input[j] < input[j - 1]) {
                swap(input, j, j - 1);
            }
        }
        vals.add(input[i]);
    }

    return (ArrayList<Integer>) vals;

}

private void swap(int[] arr, int i, int j) {
    if (i != j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
```

## 30. 连续子数组的最大和

**题目描述**

HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)

```java
//动态规划
public int FindGreatestSumOfSubArray(int[] array) {

    int[] dp = new int[array.length];
    dp[0] = array[0];
    int max = dp[0];
    for (int i = 1; i < array.length; i++) {
        dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
        max = Math.max(max, dp[i]);
    }
    return max;
}
```

## 31. 整数中1出现的次数

**题目描述**

求出1 ~ 13的整数中1出现的次数,并算出100 ~ 1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1  到 n 中1出现的次数）。

```java
//统计每一位1的个数
public int NumberOf1Between1AndN_Solution(int n) {

    int count = 0;//个数
    int i = 1;//当前位
    int current = 0;//当前数字
    int before = 0;//高位数字
    int after = 0;//低位数字
    while ((n / i) != 0) {
        current = (n / i) % 10;
        before = n / (i * 10);
        after = n - (n / i) * i;
        if (current == 0) {
            //当前位为0，个数取决于高位 高位*位数
            count += before * i;
        } else if (current == 1) {
            //当前位为1，个数取决于高位和低位 高位*位数+低位+1
            count += before * i + after + 1;
        } else {
            //当前位为2-9，个数为（高位+1）*位数
            count += (before + 1) * i;
        }
        i *= 10;
    }
    return count;
}
```

## 32. 把数组排成最小的数

**题目描述**

输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。

```java
//自定义比较器
public String PrintMinNumber(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
        return "";
    }

    List<Integer> vals = new ArrayList<>();

    for (int i = 0; i < numbers.length; i++) {
        vals.add(numbers[i]);
    }

    Collections.sort(vals, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
    StringBuilder str = new StringBuilder();
    for (Integer val : vals) {
        str.append(val);
    }
    return str.toString();
}
```

 ## 33. 丑数

**题目描述**

把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。

```java
public int GetUglyNumber_Solution(int index) {
    if (index <= 0) {
        return 0;
    }
    List<Integer> vals = new ArrayList<>();
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    vals.add(1);
    while (vals.size() < index) {
        int m1 = vals.get(i1) * 2;
        int m2 = vals.get(i2) * 3;
        int m3 = vals.get(i3) * 5;
        int min = Math.min(m1, Math.min(m2, m3));
        vals.add(min);
        if (m1 == min) i1++;
        if (m2 == min) i2++;
        if (m3 == min) i3++;
    }

    return vals.get(vals.size() - 1);
}
```

## 34. 第一次只出现一次的字符

**题目描述**

在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.

```java
//思路：利用LinkedHashMap保存字符的出现顺序，统计字符出现个数，之后遍历字符数组
//map.get(ch[i] == 1) 则输出下标
public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else {
                map.put(c, map.get(c) + 1);
            }
        }
        for(int i = 0; i < ch.length; i++){
            if(map.get(ch[i])== 1){
                return i;
            }
        }
        return -1;
    }
```



## 35. 数组中的逆序对

**题目描述**

在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 	即输出P%1000000007

```java
//思路：利用归并排序中的合并过程统计
public class Solution {

   private int count = 0;
    public int InversePairs(int [] array) {
        if(array == null || array.length < 2){
            return 0;
        }
        int[] help = new int[array.length];
        merge(array, help, 0, array.length - 1);
        return count;
    }

    private void merge(int[] nums, int[] help, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int mid = lo + (hi - lo) / 2;
        merge(nums, help, lo, mid);
        merge(nums, help, mid + 1, hi);
        sort(nums, help, mid, lo, hi);
    }

    private void sort(int[] nums, int[] help, int mid, int lo, int hi){
        for(int i = lo; i <= hi; i++){
            help[i] = nums[i];
        }
        //左数组最右
        int m = mid;
        //右数组最右
        int k = hi;
        //nums下标
        int j = hi;
        while(m >= lo || k >= mid + 1){
            if(m < lo){
                nums[j--] = help[k--];
            }else if(k <= mid){
                nums[j--] = help[m--];
            }else if(help[m] > help[k]){
                nums[j--] = help[m--];
                count += k - mid;
                count%=1000000007;
            }else {
                nums[j--] = help[k--];

            }
        }
    }

}
```

## 36. 两个链表的第一个公共结点

**题目描述**

输入两个链表，找出它们的第一个公共结点。

```java
//思路：p1到null指向p2，p2到null指向p1
public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1 != p2){
            p1 = (p1 == null ? pHead2 : p1.next);
            p2 = (p2 == null ? pHead1 : p2.next);
        }
        return p1;
    }
```

## 37. 数字在排序数组中出现的次数

**题目描述**

统计一个数字在排序数组中出现的次数。

```java
//思路:两次二分法找k+0.5，k-0.5
public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length < 1){
            return 0;
        }
        int start = getIndex(array, k - 0.5);
        int end = getIndex(array, k + 0.5);
        return end - start;
    }
    
    private int getIndex(int[] arr,double k){
        if(arr == null || arr.length < 1){
            return -1;
        }
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] < k){
                lo = mid + 1;
            }else if(arr[mid] > k){
                hi = mid - 1;
            }
        }
        return lo;
        
    }
```

## 38. 二叉树的深度

**题目描述**

输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。

```java
public class Solution {
    public int TreeDepth(TreeNode root) {
        return root == null ? 0 : Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }
}
```

## 39. 平衡二叉树

**题目描述**

输入一棵二叉树，判断该二叉树是否是平衡二叉树。

```java
//思路：只要子树不平衡，就一路返回-1，避免重复计算
public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode node) {
        if (node == null) return 0;
        int left = getDepth(node.left);
        if (left == -1) return -1;
        int right = getDepth(node.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
```

## 40. 数组中只出现一次的数字

**题目描述**

一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

```java
public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length <= 1) {
            num1[0] = num2[0] = 0;
            return;
        }
        //第一步，全部异或得到两个不同数异或结果
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num ^= array[i];
        }
        //第二步，找到num中第一个1将数组分为两个部分，每个部分包含不同数
        int i = 0;
        for (; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                break;
            }
        }
        //第三步，分别计算每一部分不同的数字
        int cn1 = 0;
        int cn2 = 0;
        for (int arr : array) {
            if ((arr & (1 << i)) != 0) {
                cn1 ^= arr;
            } else {
                cn2 ^= arr;
            }
        }
        num1[0] = cn1;
        num2[0] = cn2;
    }
```

## 41. 和为S的连续正数序列

**题目描述**

 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

```java
//思路：滑动窗口
public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> vals = new ArrayList<>();
        int i = 1;
        int j = 2;
        while (j > i) {

            int n = (i + j) * (j - i + 1) / 2;
            if (n == sum) {
                ArrayList<Integer> val = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    val.add(k);
                }
                vals.add(val);
                i++;
            } else if (n < sum) {
                j++;
            } else {
                i++;
            }
        }
        return vals;
    }
```



## 42. 和为S的两个数字

**题目描述**

输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。

```java
//思路：双指针找第一个就是乘积最小的
public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int i = 0;
        int j = array.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < j){
            int num = array[i] + array[j];
            if(num == sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }else if(num < sum){
                i++;
            }else {
                j--;
            }
        }
        return list;
    }
```

## 43. 左旋转字符串

**题目描述**

汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它

```java
public String LeftRotateString(String str, int n) {

        char[] ch = str.toCharArray();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            swap(ch, i, j);
            i++;
            j--;
        }
        i = n;
        j = ch.length - 1;
        while (i < j) {
            swap(ch, i, j);
            i++;
            j--;
        }
        i = 0;
        j = ch.length - 1;
        while (i < j) {
            swap(ch, i, j);
            i++;
            j--;
        }
        str = String.valueOf(ch);
        return str;

    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
```

## 44. 翻转单词顺序列

**题目描述**

 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？

```java
public String ReverseSentence(String str) {

        if (str == null || str.trim().equals("")) {
            return str;
        }
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
```

## 45. 扑克牌顺子

**题目描述**

LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh  My God!”不是顺子.....LL不高兴了,他想了想,决定大\小  王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So  Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，  如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。

```java
public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length < 5) {
            return false;
        }
        int[] arr = new int[14];
        arr[0] = -5;
        int min = 14;
        int max = -1;
        for (int i = 0; i < numbers.length; i++) {
            arr[numbers[i]]++;
            //排除0的干扰
            if (numbers[i] == 0) {
                continue;
            }
            //同一张牌出现多次，返回false
            if (arr[numbers[i]] > 1) {
                return false;
            }
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);

        }
        return max - min < 5;
    }
```

## 46. 孩子们的游戏

**题目描述**

每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)

```java
public int LastRemaining_Solution(int n, int m) {
        int[] people = new int[n];
        int count = n;
        int i = -1, step = 0;
        //循环n次
        while (count > 0) {
            i++;//指向删除元素的下一个元素
            if (i >= n) i = 0;//模拟环
            if (people[i] == -1) continue;//跳过-1元素
            step++;//步数++
            if (step == m) {
                people[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;
    }
```

## 47. 求1+2+...+n

**题目描述**

求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

```java
public int Sum_Solution(int n) {
        int sum = 0;
        boolean tag = (n > 0) && ((sum += Sum_Solution(n - 1) + n) >= 0);
        return sum;
    }
```

## 48. 不用加减乘除做加法

**题目描述**

写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。

```java
public int Add(int num1,int num2) {
       while(num2 != 0){
           int temp = num1 ^ num2;//保存非进位和
           num2 = (num1 & num2) << 1;//保存进位
           num1 = temp;
       }
        return num1;
    }
```

## 49. 把字符串转换为整数

**题目描述**

将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。数值为0或者字符串不是一个合法的数值则返回0。

```java
public int StrToInt(String str) {
        char[] ch = str.toCharArray();
        int num = 0;
        int pow = 1;
        boolean tag = false;//判断正负
        for (int i = ch.length - 1; i >= 0; i--) {
            if (i == 0) {
                if (ch[i] == '-') {
                    tag = true;
                    continue;
                } else if (ch[i] == '+') {
                    continue;
                }
            }
            if (ch[i] >= '0' && ch[i] <= '9') {
                num += Math.pow(10, pow - 1) * (ch[i] - '0');
                pow++;
            } else {
                return 0;
            }
        }
        if (tag) {
            num = -num;
        }
        return num;
    }
```

