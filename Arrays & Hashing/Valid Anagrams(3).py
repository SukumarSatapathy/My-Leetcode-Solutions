'''
Using hashMap
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
