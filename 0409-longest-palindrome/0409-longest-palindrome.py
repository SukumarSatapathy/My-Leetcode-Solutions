class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet = set()
        for c in s:
            if c not in hashSet:
                hashSet.add(c)
            else:
                hashSet.remove(c)
        return len(s) - len(hashSet) + 1 if len(hashSet) > 0 else len(s)