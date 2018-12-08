package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe
 * 从尾到头打印链表
 */
public class Num3 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> vals = new ArrayList<>();
        vals.addAll(printListFromTailToHead(listNode.next));
        vals.add(listNode.val);
        return vals;
    }
}
