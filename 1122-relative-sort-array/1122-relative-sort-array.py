class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        freq = {} #to store the frequency of each element of arr2 in arr1
        result, rem = [], [0]*max(arr1) #rem stores the freq of the elememts present in arr1 alone
        for num in arr2:
            freq[num] = 0
        
        for num in arr1:
            if num in freq:
                freq[num] += 1
            else:
                rem[num-1] += 1 
        
        for num in arr2:
            f = freq.pop(num) #removes and returns the value of freq[num]
            result.extend([num]*f)
        
        for i,f in enumerate(rem):
            if f != 0:
                result.extend([i+1]*f)
        
        return result