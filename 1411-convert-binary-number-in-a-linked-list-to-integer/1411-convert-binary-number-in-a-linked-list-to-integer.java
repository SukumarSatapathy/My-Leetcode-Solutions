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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int count = 0, decimal = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        curr = head;
        while (curr != null) {
            decimal += (int) Math.pow(2, --count) * curr.val;
            curr = curr.next;
        }
        return decimal;
    }
}