class Solution:
    def numRollsToTarget(self, n: int, k: int, target: int) -> int:
        dp = [[0 for _ in range(target+1)] for _ in range(n)]
        dp[0][0] = 0
        for i in range(1, min(k, target)+1):
            dp[0][i] = 1
        
        for z in range(1, n):
            for i in range(1, target + 1):
                for x in range(1, k+1):
                    if i - x >= 0:
                        dp[z][i] += dp[z - 1][i - x]
        
        return dp[-1][-1] % 1000000007