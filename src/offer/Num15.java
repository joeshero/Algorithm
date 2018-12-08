package offer;

/**
 * Created by Joe
 * 反转链表
 */
public class Num15 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    //原地反转
    public ListNode ReverseList1(ListNode head) {
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
}
