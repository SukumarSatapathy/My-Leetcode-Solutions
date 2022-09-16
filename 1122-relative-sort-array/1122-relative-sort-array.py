class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        freq = {}
        result, rem = [], [0]*max(arr1)
        for num in arr2:
            freq[num] = 0
        
        for num in arr1:
            if num in freq:
                freq[num] += 1
            else:
                rem[num-1] += 1 
        
        for num in arr2:
            f = freq.pop(num)
            result.extend([num]*f)
        
        for i,f in enumerate(rem):
            if f != 0:
                result.extend([i+1]*f)
        
        return result