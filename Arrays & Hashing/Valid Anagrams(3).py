'''
Using hashMap

Runtime: 119 ms, faster than 9.30% of Python3 online submissions for Valid Anagram.
Memory Usage: 14.4 MB, less than 67.16% of Python3 online submissions for Valid Anagram.
'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hash_s = {}
        hash_t = {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            hash_s[s[i]] = hash_s.get(s[i],0) + 1
            hash_t[t[i]] = hash_t.get(t[i],0) + 1
        return hash_s == hash_t
