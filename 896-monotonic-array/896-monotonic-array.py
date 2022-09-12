class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        mono_increase = True
        for i in range(1,len(nums)):
            if nums[i] < nums[i-1]:
                mono_increase = False
                break
        if mono_increase == False:
            mono_decrease = True
            for i in range(1,len(nums)):
                if nums[i] > nums[i-1]:
                    mono_decrease = False
                    break
        
        return mono_increase or mono_decrease
    