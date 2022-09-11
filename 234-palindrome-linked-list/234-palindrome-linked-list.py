# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        stack = []
        new_list = head
        while head:
            stack.append(head.val)
            head = head.next
        while new_list:
            if new_list.val != stack.pop():
                return False
            new_list = new_list.next
            
        return True