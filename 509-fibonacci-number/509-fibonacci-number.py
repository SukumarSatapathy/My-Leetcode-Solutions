class Solution:
    def fib(self, n: int) -> int:
        f0, f1 = 0, 1
        if n == 0 or n == 1:
            return n
        
        for i in range(1, n):
            f = f0 + f1
            f1, f0 = f, f1
        return f