class Solution:
    def hammingWeight(self, n: int) -> int:
        ham = 0
        while n:
            ham += (n & 1)
            n >>= 1
        return ham