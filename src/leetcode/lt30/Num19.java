

//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//当删除了倒数第二个节点后，链表变为 1->2->3->5.
// 
//
// 说明： 
//
// 给定的 n 保证是有效的。 
//
// 进阶： 
//
// 你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针 
// 👍 1152 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            return head;
        }
        if (head == null) {
            throw new RuntimeException();
        }
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode fast = tmp, low = tmp;
        while (n-- >= 0) {
            if (fast == null) {
                throw new RuntimeException();
            }
            fast = fast.next;
        }
        while (fast != null) {
            low = low.next;
            fast = fast.next;
        }
        low.next = low.next.next;
        return tmp.next;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

