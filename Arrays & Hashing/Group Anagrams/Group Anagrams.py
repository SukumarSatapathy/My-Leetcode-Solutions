'''
Using HashMap : Using the sorted string as key
Time : n*log(n)
space: n

Runtime: 222 ms, faster than 16.80% of Python3 online submissions for Group Anagrams.
Memory Usage: 17.8 MB, less than 67.43% of Python3 online submissions for Group Anagrams.

'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_groups = {}
        for word in strs:
            group_key = ''.join(sorted(word))
            if group_key not in anagram_groups:
                anagram_groups[group_key] = [word]
            else:
                anagram_groups[group_key].extend([word])
        return anagram_groups.values()
