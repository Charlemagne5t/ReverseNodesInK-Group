public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode preHead = new ListNode();

        return null;
    }
    private ListNode reverse(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
