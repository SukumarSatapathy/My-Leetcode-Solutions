'''
Using HashMap : Using the freq count of letters in word as key

Runtime: 225 ms, faster than 15.78% of Python3 online submissions for Group Anagrams.
Memory Usage: 19.7 MB, less than 27.50% of Python3 online submissions for Group Anagrams.
'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = {}
        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c) - ord('a')] += 1
            if tuple(count) not in ans:
                ans[tuple(count)] = [s]
            else:
                ans[tuple(count)].append(s)
        return ans.values()
