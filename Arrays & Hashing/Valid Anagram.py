class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count_s = [0]*26
        count_t = [0]*26
        if len(s) != len(t):
            return False
    
        for i in range(len(s)):
            pos_s = ord(s[i])-97
            count_s[pos_s] += 1
            pos_t = ord(t[i])-97
            count_t[pos_t] += 1
    
        for i in range(26):
            if count_s[i] != count_t[i]:
                return False
        return True
