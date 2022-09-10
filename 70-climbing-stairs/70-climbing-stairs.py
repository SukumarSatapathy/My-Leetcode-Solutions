class Solution:
    def climbStairs(self, n: int) -> int:
        last = 1
        sec_last = 0
        for i in range(n):
            ways = last + sec_last
            sec_last = last
            last = ways
        return ways