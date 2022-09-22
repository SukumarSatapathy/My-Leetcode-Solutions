class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num == 1:
            return False
        s = 1
        sqrt = int(num**0.5)
        for i in range(2, sqrt + 1):
            if num%i == 0:
                s += i + num//i
        return s==num 