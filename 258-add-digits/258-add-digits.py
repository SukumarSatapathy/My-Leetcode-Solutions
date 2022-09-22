class Solution:
    def addDigits(self, num: int) -> int:
        while num//10 != 0:
            m = num
            num = 0
            
            while m > 0:
                num += m%10
                m //= 10
            
        return num