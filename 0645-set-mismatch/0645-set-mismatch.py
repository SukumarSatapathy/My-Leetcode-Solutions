class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        numSet = set()
        n = len(nums)
        for num in nums:
            if num in numSet:
                duplicate = num
                break
            numSet.add(num)
        missing = (n*(n+1))//2 - (sum(nums) - duplicate)
        return duplicate, missing
            