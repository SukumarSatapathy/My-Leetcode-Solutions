from collections import defaultdict

class FindSumPairs:

    def __init__(self, nums1: list[int], nums2: list[int]):
        self.nums1 = nums1
        self.nums2 = nums2
        self.nums2_freq = defaultdict(int)
        for num in nums2:
            self.nums2_freq[num] += 1

    def add(self, index: int, val: int) -> None:
        old_val = self.nums2[index]
        self.nums2_freq[old_val] -= 1

        self.nums2[index] += val
        new_val = self.nums2[index]
        self.nums2_freq[new_val] += 1

    def count(self, tot: int) -> int:
        count = 0
        for num in self.nums1:
            complement = tot - num
            count += self.nums2_freq.get(complement, 0)
        return count
