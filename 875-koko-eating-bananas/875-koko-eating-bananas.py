class Solution:
    def check(self, k: int, piles: List[int], h: int) -> bool:
        time = 0
        for n in piles:
            time += math.ceil(n/k)
        if time <= h:
            return True
        else:
            return False
    
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        lo, hi = 1, max(piles)
        min_k = 0
        while lo <= hi:
            mid = (lo+hi)//2
            if self.check(mid, piles, h): #checks if Koko can eat all piles with mid as his speed
                hi = mid-1
                min_k = mid
            else:
                lo = mid+1
            
        return min_k
