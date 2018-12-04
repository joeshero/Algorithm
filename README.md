# Algorithm

[剑指offer](#剑指offer)

# 剑指offer

- [1.二维数组的查找](#1-二维数组的查找)
- [2.替换空格](#2-替换空格)
- [3.从尾到头打印链表](#3-从尾到头打印链表)
- [4.重建二叉树](#4-重建二叉树)

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

## 题目描述

输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。