package medium.algorithm.task1;

public class AddTwoNumbers {

    public ListNode addTwoNumbersMySolution(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return null;
        }
        byte sum;
        if (l2 == null && l1.val > 9) {
            sum = (byte) l1.val;
        } else if (l2 == null & l1.val < 10){
            return l1;
        } else {
            sum = (byte) (l1.val + l2.val);
        }

        if (sum > 9) {
            l1.val = sum % 10;
            if (l1.next == null & l2 != null && l2.next != null) {
                l2.next.val += 1;
                l1.next = l2.next;
                addTwoNumbersMySolution(l1.next, null);
            } else if (l1.next != null & l2 == null) {
                l1.next.val += 1;
                addTwoNumbersMySolution(l1.next, null);
            } else if (l1.next == null & (l2 == null || l2.next == null)) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val += 1;
                addTwoNumbersMySolution(l1.next, l2.next == null ? null : l2.next);
            }
        } else {
            l1.val = sum;
            if (l1.next == null & l2 != null) {
                l1.next = l2.next;
                addTwoNumbersMySolution(l1, null);
            } else  {
                addTwoNumbersMySolution(l1.next, l2.next);
            }
        }
        return l1;
    }

    public ListNode addTwoNumbersLeetCodeSolution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyHead.next;
    }
}
