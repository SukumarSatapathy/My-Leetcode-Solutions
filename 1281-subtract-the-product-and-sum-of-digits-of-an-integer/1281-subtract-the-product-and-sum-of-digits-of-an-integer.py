class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        pro = 1
        sum = 0
        while n>0:
            d = n%10
            sum += d
            pro *= d
            n //= 10
        return pro - sum