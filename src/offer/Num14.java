package offer;

/**
 * Created by Joe
 * 链表中倒数第k个结点
 */
public class Num14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        //处理特值
        if (k <= 0 || head == null) {
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
}
