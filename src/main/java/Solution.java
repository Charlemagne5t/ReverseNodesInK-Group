public class Solution {
    private void listPrinter(ListNode head) {
        while (head != null) {
            head = head.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        ListNode preHead = new ListNode();
        ListNode preHeadForCount = new ListNode();
        preHeadForCount.next = head;
        int count = -1;
        while (preHeadForCount != null) {
            preHeadForCount = preHeadForCount.next;
            count++;
        }
        int iterationsNumber = count / k;
        ListNode[] nextHead = new ListNode[1];
        ListNode[] globalTail = new ListNode[1];
        nextHead[0] = new ListNode();

        preHead.next = reverse(head, k, nextHead, globalTail);

        ListNode subTail = new ListNode();
        subTail.next = head;

        for (int i = 0; i < iterationsNumber - 1; i++) {
            subTail.next.next = reverse(nextHead[0], k, nextHead, globalTail);
            subTail.next = globalTail[0];
            listPrinter(preHead.next);
            System.out.println();
        }
        if (globalTail[0] != null) {
            globalTail[0].next = nextHead[0];
        }
        return preHead.next;
    }

    private ListNode reverse(ListNode head, int k, ListNode nextHead[], ListNode[] globalTail) {
        int i = 0;
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (i != k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            i++;
        }
        nextHead[0] = current;
        globalTail[0] = head;
        return previous;
    }
}
