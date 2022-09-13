class Solution:
   def twoSum(self, nums: List[int], target: int) -> List[int]:
       seen = {}
       for i, v in enumerate(nums):
           rem = target - nums[i]
           
           if rem in seen: #3
               return [i, seen[rem]]
           else:
               seen[v] = i  
