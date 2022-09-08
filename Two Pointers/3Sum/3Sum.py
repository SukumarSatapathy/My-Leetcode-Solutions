'''
Time: O(n*log(n))
Space: O(n^3)

Runtime: 1868 ms, faster than 35.05% of Python3 online submissions for 3Sum.
Memory Usage: 18.1 MB, less than 71.44% of Python3 online submissions for 3Sum.
'''


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        triplets = []
        nums.sort()
        n = len(nums)
        for i in range(n):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            front = i + 1
            back = n - 1
            first = nums[i]
            target = 0 - first
            while(front < back):
                if nums[front] + nums[back] < target:
                    front += 1
                elif nums[front] + nums[back] > target:
                    back -= 1
                else:
                    second = nums[front]
                    third = nums[back]
                    triplets.append([first, second, third])
                    while(front < back and nums[front] == second):
                        front += 1
                    while(front < back and nums[back] == third):
                        back -= 1
        return triplets
