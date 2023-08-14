import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 6/20/2022
 * Time: 10:01 AM
 */
public class Test {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode r = addTwoNumbers(l1, l2);
        System.out.println(r.val);
        while (r.next != null) {
            r = r.next;
            System.out.println(r.val);
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t, r = new ListNode();
        t = r;
        int m = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int s = x + y + m;
            m = s / 10;
            t.next = new ListNode(s % 10);
            t = t.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
        if (m > 0) t.next = new ListNode(m);
        return r.next;
    }
}
