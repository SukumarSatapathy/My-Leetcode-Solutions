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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        int val1 = fast.val;
        fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        int val2 = slow.val;
        slow.val = val1;
        fast = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        fast.val = val2;
        return head;
    }
}