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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        curr = head;
        k = k % count;
        if (k == 0) return head;

        for (int i = 1; i < count - k; i++) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;
        curr = newHead;
        while (curr != null && curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;
        return newHead;
    }
}