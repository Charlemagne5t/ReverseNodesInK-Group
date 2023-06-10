import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void reverseKGroupTest1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 5;
        int k = 2;
        ListNode resultedHead = new Solution().reverseKGroup(head, k);
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = resultedHead.val;
            resultedHead = resultedHead.next;
        }
        Assert.assertArrayEquals(new int[]{2, 1, 4, 3, 5}, output);
    }

    @Test
    public void reverseKGroupTest2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 5;
        int k = 3;
        ListNode resultedHead = new Solution().reverseKGroup(head, k);
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = resultedHead.val;
            resultedHead = resultedHead.next;
        }
        Assert.assertArrayEquals(new int[]{3, 2, 1, 4, 5}, output);
    }

    @Test
    public void reverseKGroupTest3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        int n = 6;
        int k = 2;
        ListNode resultedHead = new Solution().reverseKGroup(head, k);
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = resultedHead.val;
            resultedHead = resultedHead.next;
        }
        Assert.assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5}, output);
    }
    @Test
    public void reverseKGroupTest4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        int n = 2;
        int k = 2;
        ListNode resultedHead = new Solution().reverseKGroup(head, k);
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = resultedHead.val;
            resultedHead = resultedHead.next;
        }
        Assert.assertArrayEquals(new int[]{2, 1}, output);
    }
}
