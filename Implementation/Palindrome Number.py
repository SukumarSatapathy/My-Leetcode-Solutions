class Solution:
    def isPalindrome(self, x: int) -> bool:
        return x >= 0 and int(str(x)[::-1]) == x
