class Solution:
    def check(self, n):
        num = n
        while n>0:
            d = n%10
            if d == 0 or num%d != 0:
                return False
            n //= 10
        return True
        
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        res = []
        for num in range(left, right+1):
            if num <= 12 and num != 10:
                res.append(num)
            else:
                if self.check(num):
                    res.append(num)
                
        return res
